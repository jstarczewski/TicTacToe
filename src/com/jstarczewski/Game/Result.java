package com.jstarczewski.Game;

import com.jstarczewski.Figures.Figure;

public class Result {

    public static boolean isWon(Stack<Configuration> stack) {
        Configuration configuration = stack.pop();
        Figure[][] figuresConfiguration = configuration.getConfiguration();


        boolean isWon = true;
// not goood solution, abonded
        for (int i = 0; i < 3; i++) {
            isWon = true;
            Figure figure = figuresConfiguration[i][0];
            for (int j = 0; j < 3; j++) {
                if (figuresConfiguration[i][j] != figure || figuresConfiguration[i][j].isDefaultFigure())
                    isWon = false;
            }
        }


        return false;
    }

}
