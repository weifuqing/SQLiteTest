package com.example.personal.sqlitetest.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by dell on 2016/12/12.
 */

@Entity
public class Person {

    @Id
    private long _id;
    private int age;
    private String name;
    private double grade;
    private String address;
    private String hobby;
}
