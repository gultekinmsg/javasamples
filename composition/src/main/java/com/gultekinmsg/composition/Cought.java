package com.gultekinmsg.composition;

public class Cought {
    private int size;
    private int number;

    public Cought(int size, int number) {
        this.size = size;
        this.number = number;
    }

    public void getCoughts(){
        System.out.println("We got " + number + "cought, each sized " + size+" cm");
    }
}
