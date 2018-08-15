package com.jstarczewski.Figures;

import com.jstarczewski.Players.Player;

public class Tic extends Figure {


    private Player player;

    public Tic(int width, int height, int moveMadeTime, Player player) {
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

    public Player getPlayer() {
        return player;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Figure && ((Figure) obj).getName().equals(getName()));

    }

    @Override
    public boolean isDefaultFigure() {
        return false;
    }

    public String getName() {
        return "|  X  |";
    }

    @Override
    public String toString() {
        return "X";
    }
}
