package com.jstarczewski.Figures;

import com.jstarczewski.Players.Player;

public class Tac extends Figure {

    private Player player;

    public Tac(int width, int height, int moveMadeTime, Player player) {
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
    public boolean equals(Object obj) {
       return (obj instanceof Figure && ((Figure) obj).getName().equals(getName()));

    }

    @Override
    public String toString() {
        return "O";
    }
}
