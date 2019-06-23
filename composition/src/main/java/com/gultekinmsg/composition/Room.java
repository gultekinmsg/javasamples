package com.gultekinmsg.composition;

public class Room {
    private Furniture furniture;
    private Wall wall;
    private Tv tv;

    public Room(Furniture furniture, Wall wall, Tv tv) {
        this.furniture = furniture;
        this.wall = wall;
        this.tv = tv;
    }
    public void getRoomInfo(){
        furniture.getFurnitureInfo();
        wall.getWallSize();
        tv.getTvProperty();

    }
}
