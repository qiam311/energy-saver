package com.lqcw.energy_saver.replace.util;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/9/3 14:18
 * @Description:
 * @Modified By:
 */
public class ReplaceUtil {
    /**
     * 循环替换形如 tempStr 的代码
     * 替换数据来源 excelStr 从excle中复制来的数据
     * tempStr中 {0} 表示替换为excelStr的第一列数据，以此类推
     *
     * @param tempStr
     * @param excelStr
     * @return
     */
    public static String replace(String tempStr, String excelStr) {
        String[] strings = excelStr.split("\n");
        StringBuilder sb = new StringBuilder();
        for (int n = 0; n < strings.length; n++) {
            String[] split = strings[n].split("\t");
            String res = tempStr;
            for (int i = 0; i < split.length; i++) {
                res = res.replaceAll("\\{" + i + "}", split[i]);
            }
            sb.append(res + "\n");
        }
        return sb.toString();
    }

    /**
     * 循环替换形如 tempStr 的代码
     * 替换数据源 oneStr 表示tempStr中 {0} 全部替换为 oneStr
     * 替换数据来源 excelStr 从excle中复制来的数据
     * tempStr中 {1} 表示替换为excelStr的第一列数据，以此类推
     *
     * @param tempStr
     * @param oneStr
     * @param excelStr
     * @return
     */
    public static String replace(String tempStr, String oneStr, String excelStr) {
        String[] strings = excelStr.split("\n");
        StringBuilder sb = new StringBuilder();
        for (int n = 0; n < strings.length; n++) {
            String[] split = strings[n].split("\t");
            String res = tempStr.replaceAll("\\{0}", oneStr);
            for (int i = 0; i < split.length; i++) {
                res = res.replaceAll("\\{" + (i + 1) + "}", split[i]);
            }
            sb.append(res + "\n");
            if (n % 4 == 3) {
                sb.append("\n");
            }
        }
        if (strings.length % 4 != 0) {
            for (int i = 0; i < 4 - strings.length % 4; i++) {
                sb.append("<div class=\"w-quarter\"></div>");
            }
        }
        return sb.toString();
    }

}
