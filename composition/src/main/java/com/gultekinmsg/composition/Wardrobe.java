package com.gultekinmsg.composition;

public class Wardrobe {
    private int area;
    private String  colour;

    public Wardrobe(int area, String colour) {
        this.area = area;
        this.colour = colour;
    }

    public void getWardrobe(){
        System.out.println("wardrobe is " + colour + " and " + area + " m2.");
    }
}
