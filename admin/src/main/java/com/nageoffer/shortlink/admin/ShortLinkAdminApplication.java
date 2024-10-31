package com.nageoffer.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:ShortLinkAdminApplication
 * Package:com.nageoffer.shortlink.admin
 * Description:
 *
 * @Author: fsc
 * @Create: 2024/10/30 - 17:43
 * @Version: v1.0
 */
@SpringBootApplication
//添加持久层接口扫描器 一定要具体到某个包路径 减少无用的扫描
@MapperScan("com.nageoffer.shortlink.admin.dao.mapper")
public class ShortLinkAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortLinkAdminApplication.class,args);
    }
}
