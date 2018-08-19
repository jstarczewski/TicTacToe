package com.jstarczewski.Figures;

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
        return "|     |";
    }

    public boolean isDefaultFigure() {
        return true;
    }

    public String getEnumName() {
        return null;
    }

    @Override
    public String toString() {
        return getMoveMadeTime() + "@" + getWidth() + "@" + getHeight() + "@" + "DEFAULT";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
