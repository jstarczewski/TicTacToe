package com.jstarczewski;

public class Tic extends Figure {

    public Tic(int width, int height, int moveMadeTime, Player player) {
        super(width, height, moveMadeTime, player);
    }

    @Override
    public int getMoveMadeTime() {
        return super.getMoveMadeTime();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public Player getPlayer() {
        return super.getPlayer();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getName() {
        String NAME = "TIC";
        return NAME;
    }

    @Override
    public String toString() {
        String SIGN = "X";
        return SIGN;
    }
}
