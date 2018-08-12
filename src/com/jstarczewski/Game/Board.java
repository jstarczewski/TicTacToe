package com.jstarczewski.Game;

import com.jstarczewski.Players.Player;

public class Board implements Printable {

    private Configuration configuration;

    private int moveMadeTime;
    private Stack<Configuration> stack;

    public Board() {
        this.stack = new Stack<Configuration>();
        this.moveMadeTime = 0;
        this.configuration = new Configuration();
    }

    public boolean makeMove(Player player, int width, int height) {
        try {
            Boolean isMoveMade = configuration.fill(player.createFigure(width, height, moveMadeTime));
            if (isMoveMade) {
                stack.push(configuration);
                moveMadeTime++;
                this.configuration = this.configuration.rewrite();
            }
            return isMoveMade;
        } catch (NullPointerException n) {
            return false;
        }
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
    public String printGameMoves() {
        return stack.toString();
    }

    public int getMoveMadeTime() {
        return moveMadeTime;
    }


    @Override
    public void printBoard() {
        System.out.println(configuration.toString());
    }
}
