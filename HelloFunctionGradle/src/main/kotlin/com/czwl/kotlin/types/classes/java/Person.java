package com.czwl.kotlin.types.classes.java;

/**
 * @author CZ
 * @version 1.0
 * @date 2020/2/1 11:23
 */
public class Person {

    private int age;//field
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge"+ age);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
