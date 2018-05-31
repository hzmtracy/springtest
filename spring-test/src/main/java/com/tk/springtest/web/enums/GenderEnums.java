package com.tk.springtest.web.enums;

import lombok.Getter;
import java.util.HashMap;
import java.util.Map;

/**
 * 性别枚举
 */
@Getter
public enum  GenderEnums {
    MAN("M", "男"), WOMAN("F", "女");

    private String key;
    private String value;
    private static Map<String, GenderEnums> genderEnumsMap = new HashMap<>();

    static {
        for (GenderEnums genderEnums : GenderEnums.values()) {
            genderEnumsMap.put(genderEnums.getKey(), genderEnums);
        }
    }

    /**
     * 私有化构造函数
     *
     * @param key
     * @param value
     */
    private GenderEnums(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     *
     * @Title: getSexEnumByKey
     * @Description: 依据key获取枚举
     * @param key
     * @return
     */
    public static GenderEnums getSexEnumByKey(String key) {
        return genderEnumsMap.get(key);
    }
}
