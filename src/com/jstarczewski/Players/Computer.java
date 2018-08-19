package com.jstarczewski.Players;

import com.jstarczewski.Figures.Figure;
import com.jstarczewski.Figures.Figures;
import com.jstarczewski.Figures.Tac;
import com.jstarczewski.Figures.Tic;

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
        if (isFigureSet) {
            if (figure.equals(Figures.TAC))
                return new Tac(width, height, moveMadeTime, this);
            else
                return new Tic(width, height, moveMadeTime, this);
        }
        return null;
    }

    @Override
    public void setMoveIndex(int moveIndex) {
        super.setMoveIndex(moveIndex);
    }

    @Override
    public int getMoveIndex() {
        return super.getMoveIndex();
    }

    @Override
    public String getFiguresName() {
        return figure.toString();
    }
}
