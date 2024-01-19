package com.blog.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章评论
 * </p>
 *
 * @author jobob
 * @since 2024-01-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章评论ID
     */
    @TableId(value = "comment_id")
    private String commentId;

    /**
     * 文章ID
     */
    private String articleId;

    /**
     * 用户ID（评论仁）
     */
    private String userId;

    /**
     * 评论时间
     */
    private LocalDateTime commentTime;

    /**
     * 点赞次数
     */
    private Integer commentGoodNumber;


}
