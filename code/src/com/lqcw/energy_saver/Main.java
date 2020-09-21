package com.lqcw.energy_saver;

import com.lqcw.energy_saver.mock.context.AnnotationContext;

public class Main {
    //https://gitee.com/centy/class-scanner

    public static void main(String[] args) {
        AnnotationContext annotationContext = new AnnotationContext();
        annotationContext.init("com.lqcw.energy_saver.mock.anotation");
//        annotationContext.init("com.lqcw.energy_saver.mock.anotation", "com.lqcw.energy_saver.mock.process");
    }

//    public static void main(String[] args) {
//        String test1 = test1();
//        String test2 = test2();
//        String[] split = test1.split("\n\n");
//        StringBuilder sb = new StringBuilder();
//        String str = " <div class=\"d-flex\">{0}</div>";
//        for (int i = 0; i < split.length; i++) {
//            sb.append(str.replace("{0}", split[i]));
//        }
//        System.out.println(test2.replace("{2}", sb.toString()));
//    }
//
//    private static String test2() {
//        String tempStr = "<div class=\"con-item\"> \n" +
//                "<div class=\"position-relative con-item-head\">{0} \n" +
//                "<span class=\"con-item-hr\"></span> \n" +
//                "<span class=\"position-absolute con-item-icon\" data-toggle=\"collapse\" data-target=\"#{1}\" aria-expanded=\"true\" aria-controls=\"{1}\"><i class=\"icon iconfont iconxiangshangyuanjiantoushangjiantouxiangshangmianxing\"></i></span> </div> <div class=\"collapse con-item-con show\" id=\"{1}\">\n" +
//                "{2}\n" +
//                "</div></div>";
//        String nameStr = "身份信息";
//        String tableStr = "businesscreditreportpersoninfo";
//        return tempStr.replaceAll("\\{0}", nameStr).replaceAll("\\{1}", tableStr);
//    }
//
//    private static String test1() {
//        String tempStr = "<div class=\"p-2 flex-fill flex-column align-items-center droppable\"> \n" +
//                "<label class=\"p-2 \">{2}：</label> \n" +
//                "<div class=\"position-relative\"> \n" +
//                "<input type=\"text\" data=\"{{mapping.{0}_{1}.fieldId}}\" ng-model=\"mapping.{0}_{1}\">\n" +
//                "<span class=\"del\">x</span> \n" +
//                "<span class=\"info\">{{mapping.{0}_{1}.name}}</span>\n" +
//                " </div> </div>";
//        String oneStr = "businesscreditreportpersoninfo";
//        String excelStr = "genderOri\t性别\n" +
//                "birthday\t出生日期\n" +
//                "marridgeOri\t婚姻状况\n" +
//                "mobilePhone\t手机号码\n" +
//                "workPhone\t单位电话\n" +
//                "homePhone\t住宅电话\n" +
//                "educationOri\t学历\n" +
//                "degreeName\t学位 \n" +
//                "contactAddress\t通讯地址\n" +
//                "houseHold\t户籍地址\n" +
//                "employmentStatusName\t就业状况\n" +
//                "citizenShip\t国籍\n" +
//                "email\t电子邮箱\n";
//        String res = ReplaceUtil.replace(tempStr, oneStr, excelStr);
//        return res;
//    }
}
