package com.lqcw.energy_saver.mock.anotation;

import com.lqcw.energy_saver.mock.process.BasicProcess;

import java.lang.annotation.*;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/9/18 13:19
 * @Description:
 * @Modified By:
 */
@Documented
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraint {
    Class<? extends BasicProcess<?, ?>> linkedBy();
}
