package com.blog.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章对应标签
 * </p>
 *
 * @author jobob
 * @since 2024-01-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ArticleTagList implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章对应标签ID
     */
    @TableId(value = "article_tag_list_id")
    private String articleTagListId;

    /**
     * 文章ID
     */
    private String articleId;

    /**
     * 文章标签ID
     */
    private String articleTagId;


}
