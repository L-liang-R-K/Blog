package com.blog.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评论回复
 * </p>
 *
 * @author jobob
 * @since 2024-01-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CommentReply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论回复ID
     */
    @TableId(value = "comment_reply_id")
    private String commentReplyId;

    /**
     * 评论ID
     */
    private String commentId;

    /**
     * 回复评论的人ID
     */
    private String replyUserId;

    /**
     * 继续回复人的ID
     */
    private String secondlyUserId;

    /**
     * 评论回复的时间
     */
    private LocalDateTime commentReplyTime;


}
