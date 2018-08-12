package com.jstarczewski.Players;

import com.jstarczewski.Figures.Figure;

public class Computer extends Participant {
    @Override
    public boolean setTacAsFigure() {
        return super.setTacAsFigure();
    }

    @Override
    public boolean setTicAsFigure() {
        return super.setTicAsFigure();
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
