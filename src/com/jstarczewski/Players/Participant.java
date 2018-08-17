package com.jstarczewski.Players;

import com.jstarczewski.Figures.Figure;
import com.jstarczewski.Figures.Figures;

public abstract class Participant {

    private int moveIndex;
    private Figures figures;
    private Figures figure;
    boolean isFigureSet = false;



    public boolean setTacAsFigure() {
        if (!isFigureSet) {
            figure = Figures.TAC;
            isFigureSet = true;
            return true;
        }
        return false;
    }

    public boolean setTicAsFigure() {
        if (!isFigureSet) {
            figure = Figures.TIC;
            isFigureSet = true;
            return true;
        }
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
        return figures.toString();
    }
}
