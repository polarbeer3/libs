package com.qihoo360.byod.common;

import com.google.gson.Gson;

/**
 * Created by zhanghao on 2017/11/17.
 */

public class GsonUtils {
    public static String toJson(Object object, Class clazz) {
        if (object == null) {
            return "";
        }
        Gson g = new Gson();
        return g.toJson(object, clazz);
    }

    public static <T> T fromJson(String json, Class<T> classOfT) {
        if (json == null) {
            return null;
        }
        Gson g = new Gson();
        return g.fromJson(json, classOfT);
    }
}
