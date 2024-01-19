package com.blog.controller;

import cn.hutool.core.util.StrUtil;
import cn.hutool.system.HostInfo;
import cn.hutool.system.OsInfo;
import cn.hutool.system.SystemUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blog.dto.user.UserListPageDto;
import com.blog.entity.User;
import com.blog.service.IArticleService;
import com.blog.service.IArticleTagListService;
import com.blog.service.IArticleTypeService;
import com.blog.service.IUserService;
import com.blog.utils.CommonPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class AdminController {
    @Autowired
    private IArticleService articleService;
    @Autowired
    private  IArticleTypeService articleTypeService;
    @Autowired
    private IArticleTagListService articleTagListService;
    @Autowired
    private IUserService userService;


    /*
    *
    * 管理端- 首页
    * */
    @GetMapping("/")
    public String adminIndex(Model model){
        //系统信息
        OsInfo osInfo = SystemUtil.getOsInfo();
        HostInfo hostInfo = SystemUtil.getHostInfo();
        model.addAttribute("osName",osInfo.getName());
        model.addAttribute("hostAddress",hostInfo.getAddress());

        //文章数量
        long articleCount = articleService.count();
        long articleTypeCount = articleTypeService.count();
        long articleTagListCount = articleTagListService.count();
        model.addAttribute("articleCount",articleCount);
        model.addAttribute("articleTypeCount",articleTypeCount);
        model.addAttribute("articleTagListCount",articleTagListCount);

        //用户数量
        long userCount = userService.count();
        model.addAttribute("userCount",userCount);

        return "/admin/index";
    }
    /*
     *
     * 管理端- 用户列表
     * */
    @GetMapping("/user/list")
    public String userList(UserListPageDto userListPageDto, Model model){
        Integer pageNumber = userListPageDto.getPageNumber();
        String userName = userListPageDto.getUserName();

        IPage<User> userPage = new Page<>(pageNumber, 20);
        LambdaQueryWrapper<User> userLambdaQueryWrapper = Wrappers.<User>lambdaQuery().orderByDesc(User::getUserRegisterTime);
        if (StrUtil.isNotBlank(userName)){
            userLambdaQueryWrapper.like(User::getUserName,userName);
            model.addAttribute("userName",userName);
        }
        IPage<User> userIPage = userService.page(userPage, userLambdaQueryWrapper);
        model.addAttribute("userPage", CommonPage.restPage(userIPage));
        return "/admin/userList";

    }
}
