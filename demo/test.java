package com.example.demo;

public class test {
    public static void main(String[] args) {
        Pig pig1 = new Pig();

        Pig pig2 = new Pig();

        System.out.println(pig1==pig2);
        System.out.println(pig1.equals(pig2));

        System.out.println(pig1.getClass());
        System.out.println(pig2.getClass());
        System.out.println("XXX");
    }
}
