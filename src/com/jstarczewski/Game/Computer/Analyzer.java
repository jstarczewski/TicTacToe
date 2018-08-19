package com.jstarczewski.Game.Computer;

import com.jstarczewski.Figures.Figure;
import com.jstarczewski.Figures.Figures;
import com.jstarczewski.Figures.Tac;
import com.jstarczewski.Figures.Tic;
import com.jstarczewski.Game.Board;
import com.jstarczewski.Game.Configuration;
import com.jstarczewski.Players.Computer;
import com.jstarczewski.Players.Participant;

import java.util.ArrayList;

public class Analyzer {

    private ArrayList<String> rawConfigurations;
    private Configuration configurationPattern;
    private String neededFigureName;
    private Computer computer;

    public Analyzer(ConfigurationsScanner configurationsScanner) {
        rawConfigurations = configurationsScanner.getConfigurations();
        System.out.println(rawConfigurations.toString());

    }

    public Analyzer(ConfigurationsScanner configurationsScanner, Configuration configurationPattern) {
        rawConfigurations = configurationsScanner.getConfigurations();
        this.configurationPattern = configurationPattern;
        System.out.println(rawConfigurations.toString());
    }

    public void setNeededFigure(String neededFigureName) {
        this.neededFigureName = neededFigureName;
    }

    public int[] analyze(Board board) {
        int moveMadeTime = board.getMoveMadeTime();
        Configuration configuration = board.getStack().pop();
        return lookForMoveConsideringOpponentPosition(moveMadeTime, configuration);
    }

    private int[] lookForMoveConsideringOpponentPosition(int moveMadeTime, Configuration configuration) {
        String move;
        String[] moves = new String[4];
        try {
            for (String string : rawConfigurations) {
                if (string.substring(0, 1).equals(String.valueOf(moveMadeTime))) {
                    move = string;
                    moves = move.split("@");
                }
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }

        int width = Integer.valueOf(moves[1]);
        int height = Integer.valueOf(moves[2]);
        if (configuration.getConfiguration()[width][height].isDefaultFigure()) {
            // ||
            //!configuration.getConfiguration()[width][height].getEnumName().equals(neededFigure.getEnumName())) {

            if (neededFigureName != null && neededFigureName.equals(Figures.TAC.toString())) {
                return new int[]{width, height};
            } else {
                return new int[]{width,height};
            }
        }
        return new int[]{0,0};
    }

}
