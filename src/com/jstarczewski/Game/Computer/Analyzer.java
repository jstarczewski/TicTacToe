package com.jstarczewski.Game.Computer;

import com.jstarczewski.Figures.Figure;
import com.jstarczewski.Figures.Figures;
import com.jstarczewski.Figures.Tac;
import com.jstarczewski.Figures.Tic;
import com.jstarczewski.Game.Board;
import com.jstarczewski.Game.Configuration;
import com.jstarczewski.Players.Computer;

import java.util.ArrayList;
import java.util.Collections;

public class Analyzer {

    private ArrayList<ArrayList<String>> rawConfigurations;
    private Configuration configurationPattern;
    private String neededFigureName;
    private Computer computer;

    public Analyzer(ConfigurationsScanner configurationsScanner) {
        rawConfigurations = configurationsScanner.getRawConfigurations();
        System.out.println(rawConfigurations.toString());

    }

    public Analyzer(ConfigurationsScanner configurationsScanner, Configuration configurationPattern) {
        rawConfigurations = configurationsScanner.getRawConfigurations();
        this.configurationPattern = configurationPattern;
        System.out.println(rawConfigurations.toString());
    }

    public void setNeededFigure(String neededFigureName) {
        this.neededFigureName = neededFigureName;
    }

    public int[] analyze(Board board) {
        int moveMadeTime = board.getMoveMadeTime();
        Configuration configuration = board.getStack().pop();
        board.getStack().push(configuration);
        return lookForMoveConsideringOpponentPosition(moveMadeTime, configuration);
    }

    private int[] lookForMoveConsideringOpponentPosition(int moveMadeTime, Configuration configuration) {
        String move;
        ArrayList<String> currentConfiguration = new ArrayList<>();
        String[] moveData = new String[4];
        try {
            for (ArrayList<String> arrayList : rawConfigurations) {
                int compare = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        currentConfiguration.add(configuration.getConfiguration()[i][j].toString());
                    }
                }

                Collections.sort(currentConfiguration);
                int i = 0;
                for (String string : arrayList) {
                    if ((string.substring(1, 5)).equals(currentConfiguration.get(i).substring(1, 5))) {
                        compare++;
                    }
                    if (i < 9)
                        i++;
                }
                if (compare > 1) {
                    for (String string : arrayList) {
                        if (string.substring(0, 1).equals(String.valueOf(moveMadeTime + 1))) {
                            move = string;
                            moveData = move.split("@");
                        }
                    }
                    int width = Integer.valueOf(moveData[1]);
                    int height = Integer.valueOf(moveData[2]);
                    if (configuration.getConfiguration()[width][height].isDefaultFigure()) {
                        // ||
                        //!configuration.getConfiguration()[width][height].getEnumName().equals(neededFigure.getEnumName())) {

                        if (neededFigureName != null && neededFigureName.equals(Figures.TAC.toString())) {
                            return new int[]{width, height};
                        } else {
                            return new int[]{width, height};
                        }
                    }
                }


            }
                /*
                for (String string : arrayList) {
                    for (int i = 0; i < 3; i += 2) {
                        if (string.substring(0, 1).equals(String.valueOf(moveMadeTime + i))) {
                            move = string;
                            moveData = move.split("@");
                            moves.add(moveData);
                        }
                    }
                }
                for (String[] string : moves) {
                    int width = Integer.valueOf(moveData[1]);
                    int height = Integer.valueOf(moveData[2]);
                    if (configuration.getConfiguration()[width][height].isDefaultFigure()) {
                        // ||
                        //!configuration.getConfiguration()[width][height].getEnumName().equals(neededFigure.getEnumName())) {

                        if (neededFigureName != null && neededFigureName.equals(Figures.TAC.toString())) {
                            return new int[]{width, height};
                        } else {
                            return new int[]{width, height};
                        }
                    }
                }
                */
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
/*
        int width = Integer.valueOf(moveData[1]);
        int height = Integer.valueOf(moveData[2]);
        if (configuration.getConfiguration()[width][height].isDefaultFigure()) {
            // ||
            //!configuration.getConfiguration()[width][height].getEnumName().equals(neededFigure.getEnumName())) {
/*
            if (neededFigureName != null && neededFigureName.equals(Figures.TAC.toString())) {
                return new int[]{width, height};
            } else {
                return new int[]{width, height};
            }*/

        return new int[]{2, 0};
    }

}
