package com.example.demo;

import java.util.Objects;

public class Pig {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("this="+this);
        if (this == o)

            return true;
        if (o == null && getClass() != o.getClass())
            return false;
        Pig pig = (Pig) o;
        String pig;
        return age == pig.age && Objects.equals(name, pig.name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    String name1 = xiaoming;
}
