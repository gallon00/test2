package com.czxy.pojo;

import lombok.Data;

/**
 * 这是一个JavaBean
 */
@Data
public class Person {

    private String id;

    private String pname;

    private  String sex;

    private  Integer age;

    private  String info;


    private String descrition;

    private String classes;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
