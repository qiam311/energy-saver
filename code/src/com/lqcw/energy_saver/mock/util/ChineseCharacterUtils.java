package com.lqcw.energy_saver.mock.util;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/9/18 14:44
 * @Description:
 * @Modified By:
 */
public class ChineseCharacterUtils {
    private ChineseCharacterUtils() {
    }

    private static final Random r = new Random();

    /**
     * 获取一个汉字
     *
     * @return
     */
    public static String getOneChinese() {
        // 获取区码(常用汉字的区码范围为16-55)
        int regionCode = r.nextInt(39) + 16;
        // 获取位码(位码范围为1-94 由于55区的90,91,92,93,94为空,故将其排除)
        int posCode;
        if (regionCode == 55) {
            posCode = r.nextInt(88) + 1;
        } else {
            posCode = r.nextInt(93) + 1;
        }
        // 转换区位码为机内码
        int regionCodeMachine = regionCode + 160;
        int posCodeMachine = posCode + 160;
        //转为字节
        byte[] bytes = new byte[]{(byte) regionCodeMachine, (byte) posCodeMachine};
        //转为汉字
        String res = convertEncodingFormat(bytes, "gb2312");
        return res;
    }

    /**
     * 字节转字符串
     *
     * @param bytes     字节数组
     * @param encodeing 转换的编码方式
     * @return
     */
    public static String convertEncodingFormat(byte[] bytes, String encodeing) {
        String result = null;
        if (bytes != null && bytes.length > 0) {
            try {
                result = new String(bytes, encodeing);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
