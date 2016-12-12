package com.example.personal.sqlitetest.entity;

/**
 * Created by dell on 2016/12/12.
 */
public class Person {

    private int age;
    private String name;
    private double grade;
    private String address;
    private String hobby;

    public Person(int age, String name, double grade, String address, String hobby) {
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.address = address;
        this.hobby = hobby;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
