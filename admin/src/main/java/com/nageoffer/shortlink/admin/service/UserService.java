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
import com.nageoffer.shortlink.admin.dto.req.UserLoginReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserLoginRespDTO;
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

    /**
     * 根据用户名修改用户
     * @param requestParam 修改用户请求参数
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     * @param requestParam 用户登录请求参数
     * @return 用户登录返回参数 Token
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户是否登录
     * @param username 用户名
     * @param token 用户登录token
     * @return 用户是否登录标识
     */
    Boolean checkLogin(String username,String token);
}
