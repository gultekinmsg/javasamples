package com.gultekinmsg.oopmasterexercise;

public class HealtyHamburger extends Hamburger {
    public HealtyHamburger(String meat, double price) {
        super("Healty Burger", meat, price, "Brown bread");
    }

    private String extraName1;
    private double extraPrice1;
    private String extraName2;
    private double extraPrice2;

    public void wantExtra1(String extraName1, double extraPrice1) {
        System.out.println("Adding extra " + extraName1 + " for " + extraPrice1 + "$");
        this.extraName1 = extraName1;
        this.extraPrice1 = extraPrice1;
    }

    public void wantExtra2(String extraName2, double extraPrice2) {
        System.out.println("Adding extra " + extraName2 + " for " + extraPrice2 + "$");
        this.extraName2 = extraName2;
        this.extraPrice2 = extraPrice2;
    }

    @Override
    public double finalPrice() {
        double healtyPrice = super.finalPrice();
        if (this.extraName1 != null) {
            healtyPrice += this.extraPrice1;
        }
        if (this.extraName2 != null) {
            healtyPrice += this.extraPrice2;
        }
        return healtyPrice;
    }
}
