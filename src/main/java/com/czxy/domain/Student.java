package com.czxy.domain;

import lombok.Data;

/**
 * Created by liangtong.
 */
@Data
public class Student {
    private String gender;
    private String id;
    private String sname = "rose";
    private String age;
    private String desc;
}
