package org.example.b_oop.a.pet;

public abstract class Pet {

    public Pet(String name, int age){
        this.age = age;
        this.name = name;
    }

    protected String name;
    protected int age;


    public void printDetails() {
        System.out.println("name = " + name + "\nage = " + age);
    }

    public abstract int calculateAgeInHumanYears();
}
