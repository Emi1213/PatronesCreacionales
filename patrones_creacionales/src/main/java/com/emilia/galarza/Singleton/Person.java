package com.emilia.galarza.Singleton;

public class Person {
    private String name;
    private String lastName;
    private int age;

    private static Person person;

    private Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public static Person getInstance(String name, String lastName, int age) {
        if (person == null) {
            person = new Person(name, lastName, age);
        }
        return person;
    }

}
