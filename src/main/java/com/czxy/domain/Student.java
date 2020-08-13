package com.czxy.domain;

import lombok.Data;

/**
 * Created by liangtong.
 */
@Data
public class Student {
    private String id;
    private String sname;

    private  String age ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
