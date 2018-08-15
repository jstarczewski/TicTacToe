package com.jstarczewski.Game;

import com.jstarczewski.Players.Computer;
import com.jstarczewski.Players.Participant;
import com.jstarczewski.Players.Player;

import java.util.Scanner;


public class Game {

    private Participant participantOne;
    private Participant participantTwo;
    private Board board;
    private Scanner scanner;
    private boolean isGameParticipantsSet = false;
    private boolean isFiguresOrderSet = false;
    private boolean isMoveOrderSet = false;

    public Game() {
        this.board = new Board();
        this.scanner = new Scanner(System.in);
    }

    public void setGameParticipants(Games games) {
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
        if (moveOrder.equals(MoveOrder.FIRST_SECOND)) {
            participantOne.setMoveIndex(2);
            participantTwo.setMoveIndex(1);
        } else {
            participantOne.setMoveIndex(1);
            participantTwo.setMoveIndex(2);
        }
        isMoveOrderSet = true;
    }


    public void runGame() {

        if (isGameParticipantsSet && isFiguresOrderSet && isMoveOrderSet) {
            int i = 0;
            while (i <= 10 && !isWon()) {
                int width = scanner.nextInt();
                int height = scanner.nextInt();
                if (makeMove(width, height)) {
                    i++;
                    printBoard();
                }
            }
        }

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

    private void switchMoveIndexes() {
        if (participantOne.getMoveIndex() / 2 == 1) {
            participantOne.setMoveIndex(1);
            participantTwo.setMoveIndex(2);
        } else {
            participantOne.setMoveIndex(2);
            participantTwo.setMoveIndex(1);
        }
    }

    private void printBoard() {
        board.printBoard();
    }
}
