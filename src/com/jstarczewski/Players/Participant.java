package com.jstarczewski.Players;

import com.jstarczewski.Figures.Figure;

public abstract class Participant {

    private int moveIndex;

    public boolean setTacAsFigure() {
        return false;
    }

    public boolean setTicAsFigure() {
       return false;
    }


    public Figure createFigure(int width, int height, int moveMadeTime) {
        return new Figure(width, height, moveMadeTime);
    }

    public void setMoveIndex(int moveIndex) {
        this.moveIndex = moveIndex;
    }

    public int getMoveIndex() {
        return moveIndex;
    }

    public String getFiguresName() {
        return "default";
    }
}
