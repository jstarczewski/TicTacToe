package com.jstarczewski;

public class Tac extends Figure {

    private Player player;

    public Tac(int width, int height, int moveMadeTime, Player player) {
        super(width, height, moveMadeTime);
        this.player = player;
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

    public Player getPlayer() {
        return player;
    }

    @Override
    public boolean isDefaultFigure() {
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getName() {
        String NAME = "TAC";
        return NAME;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        String SIGN = "O";
        return SIGN;
    }
}
