package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * ClassName:UserLoginReqDTO
 * Package:com.nageoffer.shortlink.admin.dto.req
 * Description:用户请求登录参数
 *
 * @Author: fsc
 * @Create: 2024/11/1 - 17:38
 * @Version: v1.0
 */
@Data
public class UserLoginReqDTO {

    private String username;

    private String password;
}
