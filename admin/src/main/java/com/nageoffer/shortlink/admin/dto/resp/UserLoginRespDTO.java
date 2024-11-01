package com.nageoffer.shortlink.admin.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:UserLoginRespDTO
 * Package:com.nageoffer.shortlink.admin.dto.resp
 * Description:用户登录接口 返回响应
 *
 * @Author: fsc
 * @Create: 2024/11/1 - 17:36
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginRespDTO {
    /**
     * 用户Token
     */
    private String token;
}
