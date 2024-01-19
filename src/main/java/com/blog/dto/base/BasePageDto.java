package com.blog.dto.base;

import lombok.Data;

@Data
public class BasePageDto {
    /*
    *当前页码
    * */
    private Integer pageNumber = 1;
    /*
     *每页显示多少条数据
     * */
    private Integer pageSize = 20;
}
