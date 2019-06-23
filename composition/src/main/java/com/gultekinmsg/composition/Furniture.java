package com.gultekinmsg.composition;

public class Furniture {
    private Cought cought;
    private Wardrobe wardrobe;

    public Furniture(Cought cought, Wardrobe wardrobe) {
        this.cought = cought;
        this.wardrobe = wardrobe;
    }
    public void getFurnitureInfo(){
        wardrobe.getWardrobe();
        cought.getCoughts();
    }
}
