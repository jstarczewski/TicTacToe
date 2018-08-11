package com.jstarczewski;

public class Board implements Printable {

    private Configuration configuration;
    private int moveMadeTime;
    private Stack stack;

    Board() {

        this.moveMadeTime = 0;
        configuration = new Configuration();
    }

    public boolean makeMove(Player player, int width, int height) {
        moveMadeTime++;
        return configuration.fill(player.createFigure(width, height, moveMadeTime), width, height);
    }


    @Override
    public String printCurrentMoveData() {
        return null;
    }

    @Override
    public String printGameData() {
        return null;
    }

    @Override
    public String printBoard() {
        return null;
    }
}
