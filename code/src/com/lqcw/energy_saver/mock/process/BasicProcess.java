package com.lqcw.energy_saver.mock.process;

import java.lang.annotation.Annotation;
/**
 * @Author: LiuQian
 * @Date: Created in 2020/9/18 13:20
 * @Description:
 * @Modified By:
 */
public interface BasicProcess<A extends Annotation, T> {
    /**
     * 初始化数据
     *
     * @param constraintAnotation
     */
    default void initialize(A constraintAnotation) {
    }

    /**
     * 返回数据
     *
     * @return
     */
    T getMockValue();
}
