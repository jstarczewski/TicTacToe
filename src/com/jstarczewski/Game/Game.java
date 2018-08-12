package com.jstarczewski.Game;

import com.jstarczewski.Players.Computer;
import com.jstarczewski.Players.Participant;
import com.jstarczewski.Players.Player;

import java.util.Scanner;

public class Game {

    private Participant participantOne;
    private Participant participantTwo;
    private Scanner scanner;
    private Board board;
    private int moveIndex = 1;

    Game(Games games, FiguresOrder figuresOrder, MoveOrder moveOrder) {
        this.scanner = new Scanner(System.in);
        this.board = new Board();
        setGameParticipants(games);
        setFiguresOrder(figuresOrder);
        setMoveOrder(moveOrder);
    }

    private void setGameParticipants(Games games) {
        if (games.equals(Games.PLAYER_COMPUTER)) {
            this.participantOne = new Player();
            this.participantTwo = new Computer();
        }
        else {
            this.participantOne = new Player();
            this.participantTwo = new Player();
        }
    }
    private void setFiguresOrder(FiguresOrder figuresOrder) {
        if (figuresOrder.equals(FiguresOrder.TAC_TIC)) {
            participantOne.setTacAsFigure();
            participantTwo.setTicAsFigure();
        }
        else {
            participantOne.setTicAsFigure();
            participantTwo.setTacAsFigure();
        }

    }
    private void setMoveOrder(MoveOrder moveOrder) {
        if (moveOrder.equals(MoveOrder.FIRST_SECOND)){
            participantOne.setMoveIndex(2);
            participantTwo.setMoveIndex(1);
        }
        else {
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
        if(participantTwo.get)
        return board.makeMove()
    }
}
