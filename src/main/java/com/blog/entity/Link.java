package com.blog.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 友情链接
 * </p>
 *
 * @author jobob
 * @since 2024-01-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *  友情连接ID
     */
    @TableId(value = "link_id")
    private String linkId;

    /**
     * 连接标题
     */
    private String linkTitle;

    /**
     * 友情连接的地址
     */
    private String linkUrl;

    /**
     * 友情连接logo
     */
    private String linkLogoUrl;

    /**
     * 添加友情连接的时间
     */
    private LocalDateTime linkAddTime;


}
