package com.itclas.uts;

public class User {
    private String name;
    private int age;
    private String geder;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGeder(String geder) {
        this.geder = geder;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", geder='" + geder + '\'' +
                '}';
    }
}
