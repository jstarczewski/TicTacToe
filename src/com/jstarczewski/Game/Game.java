package com.jstarczewski.Game;

import com.jstarczewski.Players.Computer;
import com.jstarczewski.Players.Participant;
import com.jstarczewski.Players.Player;

import java.util.Scanner;

public class Game {

    private Participant participantOne;
    private Participant participantTwo;
    private Board board;
    private int moveIndex = 1;

    public Game(Games games, FiguresOrder figuresOrder, MoveOrder moveOrder) {
        this.board = new Board();
        setGameParticipants(games);
        setFiguresOrder(figuresOrder);
        setMoveOrder(moveOrder);
    }

    private void setGameParticipants(Games games) {
        if (games.equals(Games.PLAYER_COMPUTER)) {
            this.participantOne = new Player();
            this.participantTwo = new Computer();
        } else {
            this.participantOne = new Player();
            this.participantTwo = new Player();
        }
    }

    private void setFiguresOrder(FiguresOrder figuresOrder) {
        if (figuresOrder.equals(FiguresOrder.TAC_TIC)) {
            participantOne.setTacAsFigure();
            participantTwo.setTicAsFigure();
        } else {
            participantOne.setTicAsFigure();
            participantTwo.setTacAsFigure();
        }

    }

    private void setMoveOrder(MoveOrder moveOrder) {
        if (moveOrder.equals(MoveOrder.FIRST_SECOND)) {
            participantOne.setMoveIndex(2);
            participantTwo.setMoveIndex(1);
        } else {
            participantOne.setMoveIndex(1);
            participantTwo.setMoveIndex(2);
        }
    }

    public void checkPlayersFiguresTypes() {

    }

    private void runGame() {

    }

    private void runGameFirstSecond() {

    }

    private void runGameSecondFirst() {

    }

    public boolean makeMove(int width, int height) {
        if (participantOne.getMoveIndex() / 2 == 1) {
            System.out.println("Making move bu");
            switchMoveIndexes();
            System.out.println(participantOne.getFiguresName());
            return board.makeMove(participantOne, width, height);
        }
        else {
            switchMoveIndexes();
            System.out.println("Making move");
            return board.makeMove(participantTwo, width, height);
        }
    }
    private void switchMoveIndexes() {
        if (participantOne.getMoveIndex()/2==1) {
            participantOne.setMoveIndex(1);
            participantTwo.setMoveIndex(2);
        }
        else {
            participantOne.setMoveIndex(2);
            participantTwo.setMoveIndex(1);
        }
    }
    public void printBoard() {
        board.printBoard();
    }
}
