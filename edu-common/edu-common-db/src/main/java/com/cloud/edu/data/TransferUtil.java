package com.cloud.edu.data;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author xlr
 * @date 2017/12/10
 */
public class TransferUtil {
    public static <T> T transfer(Object text, Class<T> clazz) {
        return JSONObject.parseObject(JSONObject.toJSONString(text), clazz);
    }
}
