package com.example.jawbottlesthree;

public class customermodel {
    private String name;
    private int age;

    //Constructor
    public customermodel( String name, int age) {
        this.name = name;
        this.age = age;
    }

    public customermodel() {
    }

    //toString  is necessary for printing the content of a class object


    @Override
    public String toString() {
        return "customermodel{" +
                " name='" + name + '\'' +
                ", age=" + age +
                '}';
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
