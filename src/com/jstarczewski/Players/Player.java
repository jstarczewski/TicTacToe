package com.jstarczewski.Players;

import com.jstarczewski.Figures.Figure;
import com.jstarczewski.Figures.Tac;

public class Player {

    Player player;

    public Figure createFigure(int width, int height, int moveMadeTime) {
        return new Tac(width, height, moveMadeTime, player);
    }
}
