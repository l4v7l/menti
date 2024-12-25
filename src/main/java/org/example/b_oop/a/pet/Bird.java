package org.example.b_oop.a.pet;

public class Bird extends Pet {

    private int wingSpan;

    public Bird(String name, int age, int wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    @Override
    public int calculateAgeInHumanYears() {
        return age * 13;
    }
}
