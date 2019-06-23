package com.gultekinmsg.composition;

public class Tv {
    private int height;
    private int weight;

    public Tv(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void getTvProperty(){
        System.out.println("Tv size is " + (height*weight)/200 +" inch.");
    }
}
