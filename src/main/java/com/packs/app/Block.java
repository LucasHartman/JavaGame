package com.packs.app;

public class Block extends Sprite {

    public Block(int x, int y) {
        super(x,y);

        initImage();
    }

    private void initImage() {
        
        loadImage("src/resources/block1x1.png");
        getImageDimensions();
    }
}