package com.gultekinmsg.oopmasterexercise;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super("DeluxeBurger", "rawMeat", 13.34, "Garlic bread");
    }

    private String extraName1 = "chips";
    private double extraPrice1;
    private String extraName2 = "drinks";
    private double extraPrice2;


    @Override
    public double finalPrice() {
        double deluxePrice = super.finalPrice();
        System.out.println("Automatically adding extra " + extraName1 + " as package standard");
        deluxePrice += this.extraPrice1;
        System.out.println("Automatically adding extra " + extraName2 + " as package standard");
        deluxePrice += this.extraPrice2;
        return deluxePrice;
    }
}
