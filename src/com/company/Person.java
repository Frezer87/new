package com.company;

public class Person {
    //instance variables
    private String name;

    //default constructor
    public Person() {
        name = "";
    }

    //overloading a constructor
    public Person(String newName) {
        name = newName;
    }

    //non-static methods
    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}