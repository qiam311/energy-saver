package com.lqcw.energy_saver.replace.plugins;

import com.lqcw.energy_saver.replace.base.Replace;

import java.util.Map;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/8/26 17:03
 * @Description:
 * @Modified By:
 */
public class ReplacePlugin {
    public String replace(String res, String key, String value) {
        return res.replace(key, value);
    }
}
