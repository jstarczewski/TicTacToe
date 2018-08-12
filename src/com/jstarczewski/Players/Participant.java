package com.jstarczewski.Players;

import com.jstarczewski.Figures.Figure;
import com.jstarczewski.Figures.Figures;

public abstract class Participant {

    private int moveIndex;

    public boolean setTacAsFigure() {
        return true;
    }

    public boolean setTicAsFigure() {
        return true;
    }


    public Figure createFigure(int width, int height, int moveMadeTime) {
       return new Figure(width, height, moveMadeTime);
    }
    public void setMoveIndex(int moveIndex) {
        this.moveIndex=moveIndex;
    }
    public int getMoveIndex() {
        return moveIndex;
    }
}
