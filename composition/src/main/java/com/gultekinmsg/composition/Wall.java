package com.gultekinmsg.composition;

public class Wall {
    private int height;
    private int weight;
    private String colour;

    public Wall(int height, int weight, String colour) {
        this.height = height;
        this.weight = weight;
        this.colour = colour;
    }

    public void getWallSize(){
        System.out.println("Wall is " + height*weight + "m2 and it is " + colour);
    }
}
