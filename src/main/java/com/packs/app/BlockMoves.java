package com.packs.app;

public class BlockMoves extends Sprite {

    private final int INITIAL_X = 400;


    public BlockMoves(int x, int y) {
        super(x,y);

        initImage();
    }

    private void initImage() {
        
        loadImage("src/resources/block1x1Moves.png");
        getImageDimensions();
    }

    public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}