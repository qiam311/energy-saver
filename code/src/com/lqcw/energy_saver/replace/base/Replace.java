package com.lqcw.energy_saver.replace.base;

import java.util.Map;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/8/26 16:58
 * @Description:
 * @Modified By:
 */
public class Replace {
    /**
     * 需要被替换的字符串
     */
    private String srcString;

    private String key;
    private String value;

    public String getSrcString() {
        return srcString;
    }

    public void setSrcString(String srcString) {
        this.srcString = srcString;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
