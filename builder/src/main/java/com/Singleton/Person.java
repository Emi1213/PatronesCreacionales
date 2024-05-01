package com.Singleton;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Person getPerson() {
        return person;
    }

    public static void setPerson(Person person) {
        Person.person = person;
    }

    

}
