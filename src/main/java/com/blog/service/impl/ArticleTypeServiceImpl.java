package com.blog.service.impl;

import com.blog.entity.ArticleType;
import com.blog.mapper.ArticleTypeMapper;
import com.blog.service.IArticleTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.vo.ArticleTypeTreeVo;
import com.blog.vo.ArticleTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 文章分类i 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-12-21
 */
@Service
public class ArticleTypeServiceImpl extends ServiceImpl<ArticleTypeMapper, ArticleType> implements IArticleTypeService {
    @Autowired
    private ArticleTypeMapper articleTypeMapper;
    /**
     * 文章类型列表，包含文章数量
     * @return
     */
    @Override
    public List<ArticleTypeVo> articleTypeList() {
        return articleTypeMapper.articleTypeList();
    }

    /**
     * 获取首页文章类型树形目录
     * @param articleTypeParentId
     * @return
     */
    @Override
    public List<ArticleTypeTreeVo> getIndexArticleTypeList(String articleTypeParentId) {
        return articleTypeMapper.getIndexArticleTypeList(articleTypeParentId);
    }
}
