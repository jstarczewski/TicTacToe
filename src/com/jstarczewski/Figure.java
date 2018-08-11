package com.jstarczewski;

public class Figure {

    private int width;
    private int height;
    private int moveMadeTime;
    private Player player;

    public Figure(int width, int height, int moveMadeTime, Player player) {
        this.width = width;
        this.height = height;
        this.moveMadeTime = moveMadeTime;
        this.player = player;
    }

    public int getMoveMadeTime() {
        return moveMadeTime;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Player getPlayer() {
        return player;
    }
    public String getName() {
        return "Name";
    }


}
