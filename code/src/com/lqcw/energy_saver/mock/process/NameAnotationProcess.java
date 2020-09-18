package com.lqcw.energy_saver.mock.process;

import com.lqcw.energy_saver.mock.anotation.NameAnnotation;
import com.lqcw.energy_saver.mock.constant.NameConstant;
import com.lqcw.energy_saver.mock.utils.ChineseCharacterUtils;

import java.util.Random;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/9/18 13:16
 * @Description:
 * @Modified By:
 */
public class NameAnotationProcess implements BasicProcess<NameAnnotation, String> {
    @Override
    public void initialize(NameAnnotation constraintAnotation) {

    }

    /**
     * 姓
     */

    private static final Random r = new Random();

    @Override
    public String getMockValue() {
        StringBuilder sb = new StringBuilder();
        int idx = r.nextInt(NameConstant.LAST_NAME_ARRAY.length - 1);
        sb.append(NameConstant.LAST_NAME_ARRAY[idx]);
        int count = r.nextInt(1) + 1;
        for (int i = 0; i < count; i++) {
            sb.append(ChineseCharacterUtils.getOneChinese());
        }
        return sb.toString();
    }
}
