package com.blog.dto.user;

import com.blog.dto.base.BasePageDto;
import lombok.Data;

@Data
public class UserListPageDto extends BasePageDto {
    /*
    *用户名
    * */
    private String userName;
}
