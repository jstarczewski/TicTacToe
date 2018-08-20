package com.jstarczewski.Game.Computer;

import com.jstarczewski.Figures.Figure;
import com.jstarczewski.Figures.Figures;
import com.jstarczewski.Game.Board;
import com.jstarczewski.Game.Configuration;

public class Mover {

    public static int[] generateMove(Board board, String figuresName) {
        Configuration configuration = board.getStack().pop();
        board.getStack().push(configuration);
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {

        //        if ()



            }
        }

        Figure[][] figuresConfiguration = configuration.getConfiguration();

        if ((!figuresConfiguration[0][0].isDefaultFigure() ||
                !figuresConfiguration[0][2].isDefaultFigure() ||
                !figuresConfiguration[2][0].isDefaultFigure() ||
                !figuresConfiguration[2][2]. isDefaultFigure() && (figuresConfiguration[1][1].isDefaultFigure()
                && !figuresConfiguration[1][1].getEnumName().equals(figuresName)))) {
            return new int[]{1,1};
        }
        return new int[]{1,0};
    }


}
