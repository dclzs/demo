package com.example.demo.myh2.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.example.demo.myh2.entity.enums.AgeEnum;
import com.example.demo.myh2.entity.enums.PhoneEnum;

import java.util.Date;

public class User extends SuperEntity<User> {

    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private AgeEnum age;
    /**
     * 这里故意演示注解可无
     */
    @TableField("test_type")
    @TableLogic
    private Integer testType;

    /**
     * 测试插入填充
     */
    @TableField("test_date")
    private Date testDate;

    private Long role;
    private PhoneEnum phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgeEnum getAge() {
        return age;
    }

    public void setAge(AgeEnum age) {
        this.age = age;
    }

    public Integer getTestType() {
        return testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    public PhoneEnum getPhone() {
        return phone;
    }

    public void setPhone(PhoneEnum phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", testType=" + testType +
                ", testDate=" + testDate +
                ", role=" + role +
                ", phone=" + phone +
                '}';
    }
}
