package com.github.xrixcis.thymeleaf.core.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;

/**
 * Created by xrixcis on 30.12.16.
 */
public class User {

    @NotBlank
    private String name;

    @Min(1)
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}
