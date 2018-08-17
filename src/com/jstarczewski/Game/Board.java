package com.jstarczewski.Game;

import com.jstarczewski.Players.Participant;

public class Board implements Printable {

    private Configuration configuration;

    private int moveMadeTime;
    private Stack<Configuration> stack;
    private boolean isWon = false;

    public Board() {
        this.stack = new Stack<Configuration>();
        this.moveMadeTime = 0;
        this.configuration = new Configuration();
    }

    public boolean makeMove(Participant participant, int width, int height) {
        try {
            Boolean isMoveMade = configuration.fill(participant.createFigure(width, height, moveMadeTime + 1));
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

    public boolean isWon() {
        Configuration configuration = stack.pop();
        if (Result.isWon(configuration)) {
            stack.push(configuration);
            isWon = true;
            return true;
        } else {
            stack.push(configuration);
            return false;
        }
    }

    public int getMoveMadeTime() {
        return moveMadeTime;
    }

    public Stack<Configuration> getStack() {
        return stack;
    }

    @Override
    public void printCurrentMoveData() {

    }

    @Override
    public void printGameData() {

    }

    @Override
    public void printBoard() {
        System.out.println(configuration.toString());
    }

    @Override
    public void printGameMoves() {
        if (isWon) {
            while (!stack.isEmpty()) {
                System.out.println(stack.pop().toString());
            }
        }
    }

    @Override
    public void printHelp() {

    }
}
