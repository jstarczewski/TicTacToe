package com.jstarczewski.Game;

import com.jstarczewski.Figures.Figure;

public final class Result {

    private Result() {}

    public static boolean isWon(Configuration configuration) {
        Figure[][] figuresConfiguration = configuration.getConfiguration();

        for (int i = 0; i < 3; i++) {
            if ((i == 0) && (figuresConfiguration[i][i].equals(figuresConfiguration[i + 1][i + 1]) && (figuresConfiguration[i + 1][i + 1].equals(figuresConfiguration[i + 2][i + 2]))))
                return true;
            if ((i == 2) && (figuresConfiguration[i][i - 2].equals(figuresConfiguration[i - 1][i - 1]) && (figuresConfiguration[i - 1][i - 1].equals(figuresConfiguration[i - 2][i])))) {
                return true;
            }
            if (i != 2 && i != 1 && (figuresConfiguration[0][i].equals(figuresConfiguration[1][i]) && figuresConfiguration[1][i].equals(figuresConfiguration[2][i]))) {
                return true;
            }
            if (i != 2 && i != 1 && (figuresConfiguration[i][0].equals(figuresConfiguration[i][1]) && figuresConfiguration[i][1].equals(figuresConfiguration[i][2]))) {
                return true;
            }
        }
        return false;
    }

}
