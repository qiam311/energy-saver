package com.lqcw.energy_saver.mock.anotation;

import java.lang.annotation.*;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/9/18 11:00
 * @Description: 日期注解
 * @Modified By:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DateAnnotation {
    /**
     * 最大日期
     * 格式与 format() 一致
     *
     * @return
     */
    String maxDate();

    /**
     * 最小日期
     * 格式与 format() 一致
     *
     * @return
     */
    String minDate();

    /**
     * 日期格式
     * 仅支持以“ -/_”符号分隔
     *
     * @return
     */
    String format();
}
