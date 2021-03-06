package com.jstarczewski.Game;

import com.jstarczewski.Figures.Figures;
import com.jstarczewski.Game.Computer.Analyzer;
import com.jstarczewski.Game.Computer.ConfigurationsScanner;
import com.jstarczewski.Game.GamesSettings.Axis;
import com.jstarczewski.Game.GamesSettings.FiguresOrder;
import com.jstarczewski.Game.GamesSettings.Games;
import com.jstarczewski.Game.GamesSettings.MoveOrder;
import com.jstarczewski.Players.Computer;
import com.jstarczewski.Players.Participant;
import com.jstarczewski.Players.Player;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Game implements Printable {

    /*
     * File structure ->
     *   constructors
     *   game settings
     *   other methods
     *   printable interface methods
     *
     * */


    private Participant participantOne;
    private Participant participantTwo;
    private Board board;
    private Scanner scanner;
    private boolean isGameParticipantsSet = false;
    private boolean isFiguresOrderSet = false;

    private boolean isMoveOrderSet = false;
    private boolean isWidthAndHeightConverted = false;
    private Games games;
    private MoveOrder moveOrder;
    private FiguresOrder figuresOrder;
    private Axis axis;

    public Game() {
        this.board = new Board();
        this.scanner = new Scanner(System.in);
    }

    public void setGameParticipants(Games games) {
        this.games = games;
        if (games.equals(Games.PLAYER_COMPUTER)) {
            this.participantOne = new Player();
            this.participantTwo = new Computer();
        } else {
            this.participantOne = new Player();
            this.participantTwo = new Player();
        }
        isGameParticipantsSet = true;
    }

    public void setFiguresOrder(FiguresOrder figuresOrder) {
        this.figuresOrder = figuresOrder;
        if (figuresOrder.equals(FiguresOrder.TAC_TIC)) {
            participantOne.setTacAsFigure();
            participantTwo.setTicAsFigure();
        } else {
            participantOne.setTicAsFigure();
            participantTwo.setTacAsFigure();
        }
        isFiguresOrderSet = true;
    }

    public void setMoveOrder(MoveOrder moveOrder) {
        this.moveOrder = moveOrder;
        if (moveOrder.equals(MoveOrder.FIRST_SECOND)) {
            participantOne.setMoveIndex(2);
            participantTwo.setMoveIndex(1);
        } else {
            participantOne.setMoveIndex(1);
            participantTwo.setMoveIndex(2);
        }
        isMoveOrderSet = true;
    }

    public void setGameAxis(Axis axis) {
        this.axis = axis;
        if (!axis.equals(Axis.POSITIVE_X_AND_NEGATIVE_Y)) {
            isWidthAndHeightConverted = true;
        }
    }

    /*
     * runGame() will be covered to void but was changed to boolean to make testing easier
     *
     * */


    // overloaded method only for testing
    public boolean runGame(int width, int height) {

        if (isGameParticipantsSet && isFiguresOrderSet && isMoveOrderSet) {
            int i = 0;
            boolean isMoveMade = false;
            while (i < 10 && !isWon()) {
                if (isWidthAndHeightConverted) {
                    isMoveMade = makeMove(convertWidthAndHeight(width, height));
                    i++;
                    printBoard();
                } else {
                    isMoveMade = makeMove(width, height);

                }
                if (isMoveMade) {
                    i=10;
                    printBoard();
                }
                else {
                    return false;
                }
            }
            return isMoveMade;
        }
        return false;
    }

    public boolean runGame() {

        if (isGameParticipantsSet && isFiguresOrderSet && isMoveOrderSet) {
            int i = 0;
            boolean isMoveMade = false;
            boolean isInputCorrect = true;
            while (i < 10 && !isWon()) {
                int width = 0;
                int height = 0;
                try {
                    System.out.println("Insert width");
                    width = scanner.nextInt();
                    System.out.println("Insert height");
                    height = scanner.nextInt();
                } catch (InputMismatchException e) {
                    isInputCorrect = false;
                }
                if (isInputCorrect) {
                    if (isWidthAndHeightConverted) {
                        isMoveMade = makeMove(convertWidthAndHeight(width, height));
                        i++;
                        printBoard();
                    } else {
                        isMoveMade = makeMove(width, height);

                    }
                    if (isMoveMade) {
                        i++;
                        printBoard();
                    }
                }

            }
            return isMoveMade;
        }
        return false;
    }

    private int[] convertWidthAndHeight(int width, int height) {
        return new int[]{width, Math.abs(height - 2)};
    }

    private boolean isWon() {
        if (board.getMoveMadeTime() >= 3 && board.isWon()) {
            System.out.println("Somebody won");
            return true;
        }
        return false;
    }

    private boolean makeMove(int width, int height) {
        if (participantOne.getMoveIndex() / 2 == 1) {
            if (board.makeMove(participantOne, width, height)) {
                switchMoveIndexes();
                return true;
            }
            return false;
        } else {
            if (board.makeMove(participantTwo, width, height)) {
                switchMoveIndexes();
                return true;
            }
            return false;
        }

    }

    private boolean makeMove(int[] widthAndHeight) {
        try {
            return makeMove(widthAndHeight[0], widthAndHeight[1]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            return false;
        }
    }

    private void switchMoveIndexes() {
        if (participantOne.getMoveIndex() / 2 == 1) {
            participantOne.setMoveIndex(1);
            participantTwo.setMoveIndex(2);
        } else {
            participantOne.setMoveIndex(2);
            participantTwo.setMoveIndex(1);
        }
    }

    public boolean isGameParticipantsSet() {
        return isGameParticipantsSet;
    }

    public boolean isFiguresOrderSet() {
        return isFiguresOrderSet;
    }

    public boolean isMoveOrderSet() {
        return isMoveOrderSet;
    }

    public boolean isWidthAndHeightConverted() {
        return isWidthAndHeightConverted;
    }

    @Override
    public void printCurrentMoveData() {

    }

    @Override
    public void printGameData() {

        if (isGameParticipantsSet && isFiguresOrderSet && isMoveOrderSet) {
            System.out.println("Game type : " + games);
            System.out.println("Figures orde : " + figuresOrder);
            System.out.println("Move order : " + moveOrder);
            System.out.println("Axis type : " + axis);
        } else {
            System.out.println("Set game options first!");
        }
    }

    @Override
    public void printBoard() {
        board.printBoard();
    }

    @Override
    public void printGameMoves() {
        board.printGameMoves();
    }

    @Override
    public void printHelp() {
        String help = "Welcom to TicTacToe text interface game. Give two integer numbers represanting width and height to add a figure to the board";
        System.out.println(help);
    }
}
