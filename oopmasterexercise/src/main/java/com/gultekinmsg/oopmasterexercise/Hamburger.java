package com.gultekinmsg.oopmasterexercise;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRoll;

    public Hamburger(String name, String meat, double price, String breadRoll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoll = breadRoll;
    }

    private String extraName1;
    private double extraPrice1;
    private String extraName2;
    private double extraPrice2;
    private String extraName3;
    private double extraPrice3;
    private String extraName4;
    private double extraPrice4;

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

    public void wantExtra3(String extraName3, double extraPrice3) {
        System.out.println("Adding extra " + extraName3 + " for " + extraPrice3 + "$");
        this.extraName3 = extraName3;
        this.extraPrice3 = extraPrice3;
    }

    public void wantExtra4(String extraName4, double extraPrice4) {
        System.out.println("Adding extra " + extraName4 + " for " + extraPrice4 + "$");
        this.extraName4 = extraName4;
        this.extraPrice4 = extraPrice4;
    }

    public double finalPrice() {
        double totalPrice = this.price;
        if (extraName1 != null) {
            totalPrice += this.extraPrice1;
        }
        if (extraName2 != null) {
            totalPrice += this.extraPrice2;
        }
        if (extraName3 != null) {
            totalPrice += this.extraPrice3;
        }
        if (extraName4 != null) {
            totalPrice += this.extraPrice4;
        }
        return totalPrice;
    }
}
