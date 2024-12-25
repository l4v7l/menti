package org.example.b_oop.a.pet;

public class Dog extends Pet {

    private String favToy;

    public Dog(String name, int age, String favToy) {
        super(name, age);
        this.favToy = favToy;
    }

    @Override
    public int calculateAgeInHumanYears() {
        return age * 7;
    }
}
