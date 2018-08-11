package com.jstarczewski;

public class Player {

    Player player;

    public Figure createFigure(int width, int height, int moveMadeTime) {
        return new Tac(width, height, moveMadeTime, player);
    }
}
