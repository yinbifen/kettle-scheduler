package com.wh.kettlescheduler.enums;

import com.wh.kettlescheduler.enums.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

/**
 * 脚本运行类型枚举类
 *
 * @author lyf
 */
@Getter
@AllArgsConstructor
public enum LogLevelEnum implements BaseEnum<String> {
    /**
     * 错误日志
     */
    ERROR("Error", "错误日志"),
    /**
     * 最小日志
     */
    MINIMAL("Minimal", "最小日志"),
    /**
     * 基本日志
     */
    BASIC("Basic", "基本日志"),
    /**
     * 详细日志
     */
    DETAILED("Detailed", "详细日志"),
    /**
     * 调试日志
     */
    DEBUG("Debug", "调试日志"),
    /**
     * 行级日志（非常详细）
     */
    ROWLEVEL("Rowlevel", "行级日志（非常详细）");

    private String code;
    private String desc;

    public static LogLevelEnum getEnum(String code) {
        return Arrays.stream(values()).filter(b -> Objects.equals(b.code, code)).findFirst().orElse(null);
    }

    public static String getEnumDesc(String code) {
        LogLevelEnum e = getEnum(code);
        return e != null ? e.desc : null;
    }
}