package com.lqcw.energy_saver.mock.executable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/9/21 10:00
 * @Description:
 * @Modified By:
 */
public class MockExecute {
    /**
     * 自动生成 t 属性的数据
     *
     * @param t      待生成的对象
     * @param tClass 对象对应的class
     * @param <T>
     */
    public static <T> void execute(T t, Class<T> tClass) {
        // 获取全部属性字段
        Field[] fields = tClass.getDeclaredFields();
        // 遍历字段
        for (Field field:fields){
            // 获取字段的全部注解
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation:annotations){
//                if ()
            }
        }
    }
}
