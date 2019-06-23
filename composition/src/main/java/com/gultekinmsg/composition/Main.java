package com.gultekinmsg.composition;

public class Main {
    public static void main(String[] args) {

        Cought cought = new Cought(100,3);
        Wardrobe wardrobe=new Wardrobe(2,"brown");
        Furniture furniture=new Furniture(cought,wardrobe);

        Tv tv= new Tv(45,60);
        Wall wall = new Wall(3,4,"White");

        Room room = new Room(furniture,wall,tv);
        room.getRoomInfo();
    }
}
