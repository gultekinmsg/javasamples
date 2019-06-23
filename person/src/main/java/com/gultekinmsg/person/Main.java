package com.gultekinmsg.person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("FullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("john");
        person.setAge(18);
        System.out.println("FullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("FullName = " + person.getFullName());
    }
}
