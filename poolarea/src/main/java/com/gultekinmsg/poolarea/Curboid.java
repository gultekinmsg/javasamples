package com.gultekinmsg.poolarea;

public class Curboid extends Rectangle{
    private double height;

    public Curboid(double width, double length, double height) {
        super(width, length);
        if (height<0){
            this.height=0;
        }else {
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return height*getArea();
    }
}
