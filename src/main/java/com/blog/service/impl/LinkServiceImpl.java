package com.blog.service.impl;

import com.blog.entity.Link;
import com.blog.mapper.LinkMapper;
import com.blog.service.ILinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 友情链接 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2024-01-16
 */
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements ILinkService {

}
