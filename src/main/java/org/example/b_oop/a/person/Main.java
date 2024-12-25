package org.example.b_oop.a.person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Alex", 33);
        Person person2 = new Person("Piter", 26);

        System.out.println(person.getName());
        System.out.println(person2.getName());
    }
}
