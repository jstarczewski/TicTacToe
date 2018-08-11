package com.jstarczewski;

public class Board implements Printable {

    private Configuration configuration;
    private int moveMadeTime;
    private Stack<Configuration> stack;

    Board() {
        this.stack = new Stack<Configuration>();
        this.moveMadeTime = 0;
        this.configuration = new Configuration();
    }

    public boolean makeMove(Player player, int width, int height) {
        moveMadeTime++;
        Boolean isMoveMade = configuration.fill(player.createFigure(width, height, moveMadeTime), width, height);
        if (isMoveMade) {
            stack.push(configuration);
            this.configuration = this.configuration.rewrite();
        }
        return isMoveMade;
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

    @Override
    public void printBoard() {
        System.out.println(configuration.toString());
    }
}
