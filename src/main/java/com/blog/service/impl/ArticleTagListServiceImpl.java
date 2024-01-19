package com.blog.service.impl;

import com.blog.entity.ArticleTagList;
import com.blog.mapper.ArticleTagListMapper;
import com.blog.service.IArticleTagListService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章对应标签 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2024-01-16
 */
@Service
public class ArticleTagListServiceImpl extends ServiceImpl<ArticleTagListMapper, ArticleTagList> implements IArticleTagListService {

}
