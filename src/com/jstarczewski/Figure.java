package com.jstarczewski;

public class Figure {

    private int width;
    private int height;
    private int moveMadeTime;

    public Figure(int width, int height, int moveMadeTime) {
        this.width = width;
        this.height = height;
        this.moveMadeTime = moveMadeTime;
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

    public String getName() {
        return "Name";
    }
    public boolean isDefaultFigure() {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
