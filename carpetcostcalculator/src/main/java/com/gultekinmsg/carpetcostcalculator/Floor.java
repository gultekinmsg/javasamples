package com.gultekinmsg.carpetcostcalculator;

public class Floor {
    private double width;
    private double height;

    public Floor(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else if (height < 0) {
            this.height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public double getArea(){
        return width*height;
    }
}
