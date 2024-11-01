package com.nageoffer.shortlink.admin.dto.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nageoffer.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;
import lombok.Data;

/**
 * ClassName:UserRespDTO
 * Package:com.nageoffer.shortlink.admin.dto.resp
 * Description:用户返回参数相应
 *
 * @Author: fsc
 * @Create: 2024/10/30 - 20:34
 * @Version: v1.0
 */
@Data
public class UserActualRespDTO {
    private Long id;

    /**
     * 用户名
     */
    private String username;

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
