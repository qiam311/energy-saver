package test.com.lqcw.energy_saver.plugins;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/8/26 17:07
 * @Description:
 * @Modified By:
 */
class ReplacePluginTest {

    @Test
    public static void replace() {
        String src = "<div class=\"p-2 flex-fill flex-column align-items-center droppable\"> <label class=\"p-2 \">$1：</label> <div class=\"position-relative\"> <select ng-model=\"mapping.$2.$0\" class=\"form-control form-control-chosen-optgroup my-chosen-select\" data-name=\"$2_$0\" title=\"clickable_optgroup\" data-placeholder=\"Please select...\"> <option value=\"\"> </option> <optgroup label=\"{{key}}\" ng-repeat=\"(key,item) in head \"> <option ng-repeat=\"(x,option) in item track by $index\" ng-disabled=\"option.checked\" value=\"{{option}}\"> {{option.headName}} </option> </optgroup> </select></div> </div>";
        String table = "businesscreditreportqueryrecdetail";
        String mapStr = "recordsId\t编号\n" +
                "queryDate\t查询日期\n" +
                "operator\t查询操作员\n" +
                "queryReason\t查询原因\n";
        mapStr = mapStr.replaceAll(" ", "");
        String[] strings = mapStr.split("\n");
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            String[] split = str.split("\t");
            String res = src.replace("$0", split[0]);
            res = res.replace("$1", split[1]);
            res = res.replace("$2", table);
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        replace();
    }
}