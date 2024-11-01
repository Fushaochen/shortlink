package com.nageoffer.shortlink.admin.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * ClassName:MyMetaObjectHandler
 * Package:com.nageoffer.shortlink.admin.config
 * Description:
 *
 * @Author: fsc
 * @Create: 2024/11/1 - 11:04
 * @Version: v1.0
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"createTime", Date::new, Date.class);
        this.strictInsertFill(metaObject,"updateTime", Date::new, Date.class);
        this.strictInsertFill(metaObject,"delFlag", () -> 0, Integer.class);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"updateTime", Date::new, Date.class);
    }
}
