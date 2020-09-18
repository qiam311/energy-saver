package test.com.lqcw.energy_saver.mock.util;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/9/18 11:41
 * @Description:
 * @Modified By:
 */
public class User implements Serializable {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 学历
     */
    private String edu;
    /**
     * 余额
     */
    private BigDecimal balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
