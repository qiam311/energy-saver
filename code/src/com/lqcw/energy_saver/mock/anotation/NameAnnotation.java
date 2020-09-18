package com.lqcw.energy_saver.mock.anotation;

import com.lqcw.energy_saver.mock.process.NameAnotationProcess;

import java.lang.annotation.*;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/9/18 13:12
 * @Description:
 * @Modified By:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(linkedBy = NameAnotationProcess.class)
public @interface NameAnnotation {
    /**
     * 姓名正则
     *
     * @return
     */
    String nameRegx();
}
