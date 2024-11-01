package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * ClassName:UserRegisterReqDTO
 * Package:com.nageoffer.shortlink.admin.dto.req
 * Description:用户修改请求参数
 *
 * @Author: fsc
 * @Create: 2024/11/1 - 10:42
 * @Version: v1.0
 */
@Data
public class UserUpdateReqDTO {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;
}
