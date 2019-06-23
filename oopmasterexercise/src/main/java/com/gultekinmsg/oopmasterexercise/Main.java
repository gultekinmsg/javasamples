package com.gultekinmsg.oopmasterexercise;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("myBurger", "cowMeat", 5.22, "whiteBread");
        hamburger.wantExtra1("tomato", 1.45);
        hamburger.wantExtra2("lettuce", 0.52);
        hamburger.wantExtra3("sauce", 0.98);
        hamburger.wantExtra4("onion", 1.23);
        System.out.println("Total cost is = " + hamburger.finalPrice() + "$");

        System.out.println("-----");
        HealtyHamburger healthyBurger = new HealtyHamburger("sausage", 3.00);
        healthyBurger.wantExtra1("carrot", 1.45);
        healthyBurger.wantExtra2("milk", 0.51);
        System.out.println("Total cost is = " + healthyBurger.finalPrice() + "$");

        System.out.println("-----");
        DeluxeHamburger deluxeBurger = new DeluxeHamburger();
        System.out.println("Total cost is = " + deluxeBurger.finalPrice() + "$");
    }
}
