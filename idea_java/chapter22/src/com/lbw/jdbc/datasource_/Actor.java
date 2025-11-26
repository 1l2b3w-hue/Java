package com.lbw.jdbc.datasource_;

import java.time.LocalDateTime;
import java.util.Date;

// 与数据库的actor 表相关联
public class Actor { // 也称为 javaBean ，POJO,Domain
    private Integer id;
    private String name;
    private String sex;
    private LocalDateTime birthday;
    private String phone;

    public Actor() { // 提供一个无参构造器，方便后续反射操作
    }

    public Actor(Integer id, String name, String sex, LocalDateTime birthday, String phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\nActor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                '}';
    }
}
