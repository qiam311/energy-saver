package com.lqcw.energy_saver.mock.util;

import java.lang.reflect.Field;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/9/18 11:08
 * @Description: 利用注解填充对应数据
 * @Modified By:
 */
public class MockDataUtils {
    public static void mockData(Object object, Class clazz) {
        //获取字段
        Field[] fields = clazz.getDeclaredFields();
        //遍历字段
        for (Field field : fields) {

        }
    }
}
