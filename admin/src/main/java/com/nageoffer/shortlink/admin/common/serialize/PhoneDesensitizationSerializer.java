package com.nageoffer.shortlink.admin.common.serialize;

/**
 * ClassName:PhoneDesensitizationSerializer
 * Package:com.nageoffer.shortlink.admin.common.serialize
 * Description:
 *
 * @Author: fsc
 * @Create: 2024/10/31 - 21:16
 * @Version: v1.0
 */

import cn.hutool.core.util.DesensitizedUtil;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * 手机号脱敏反序列化
 */
public class PhoneDesensitizationSerializer extends JsonSerializer<String> {

    @Override
    public void serialize(String phone, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String phoneDesensitization = DesensitizedUtil.mobilePhone(phone);
        jsonGenerator.writeString(phoneDesensitization);
    }
}
