package com.jstarczewski.Figures;

import com.jstarczewski.Players.Participant;

public class Tac extends Figure {

    private Participant player;

    public Tac(int width, int height, int moveMadeTime, Participant player) {
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

    public Participant getPlayer() {
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
        return "|  O  |";
    }

    @Override
    public String getEnumName() {
        return Figures.TAC.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Figure && ((Figure) obj).getName().equals(getName()));

    }

    @Override
    public String toString() {
        return getMoveMadeTime() + "@" + getWidth() + "@" + getHeight() + "@" + getEnumName();
    }
}
