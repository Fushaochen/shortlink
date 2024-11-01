package com.nageoffer.shortlink.admin.service;

/**
 * ClassName:UserService
 * Package:com.nageoffer.shortlink.admin.service
 * Description:
 *
 * @Author: fsc
 * @Create: 2024/10/30 - 20:26
 * @Version: v1.0
 */

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名返回用户实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否存在
     * @param username
     * @return 用户名存在返回 True 不存在返回 False
     */

    Boolean availableUsername(String username);

    /**
     * 注册用户
     * @param requestParam 注册用户请求参数
     */
    void register(UserRegisterReqDTO requestParam);
}
