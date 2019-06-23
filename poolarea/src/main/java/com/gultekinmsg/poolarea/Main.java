package com.gultekinmsg.poolarea;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.lenght= " + rectangle.getLength());
        System.out.println("recangle.area= " + rectangle.getArea());

        Curboid curboid = new Curboid(5, 10, 5);
        System.out.println("curboid.width= " + curboid.getWidth());
        System.out.println("curboid.lenght= " + curboid.getLength());
        System.out.println("curboid.area= " + curboid.getArea());
        System.out.println("curboid.hight= " + curboid.getHeight());
        System.out.println("curboid.volume= " + curboid.getVolume());

    }
}
