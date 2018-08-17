package com.jstarczewski.Players;

import com.jstarczewski.Figures.Figure;
import com.jstarczewski.Figures.Figures;

public class Computer extends Participant {

    private Figures figure;
    private boolean isFigureSet = false;


    @Override
    public boolean setTacAsFigure() {
        if (!isFigureSet) {
            figure = Figures.TAC;
            isFigureSet = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean setTicAsFigure() {
        if (!isFigureSet) {
            figure = Figures.TIC;
            isFigureSet = true;
            return true;
        }
        return false;
    }

    @Override
    public Figure createFigure(int width, int height, int moveMadeTime) {
        return super.createFigure(width, height, moveMadeTime);
    }

    @Override
    public void setMoveIndex(int moveIndex) {
        super.setMoveIndex(moveIndex);
    }
}
