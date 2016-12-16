package com.example.personal.sqlitetest.entity;


/**
 * Created by dell on 2016/12/12.
 */

public class Person {

    private long _id;
    private int age;
    private String name;
    private String hobby;

    public Person(long _id, int age, String name, String hobby) {
        this._id = _id;
        this.age = age;
        this.name = name;
        this.hobby = hobby;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
