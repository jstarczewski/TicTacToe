package com.jstarczewski.Tests;

import com.jstarczewski.Game.Game.Board;
import com.jstarczewski.Players.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    private Player player;
    private Board board;

    @org.junit.Before
    public void setUp() {
        player = new Player();
        board = new Board();
    }


    @Test
    public void makeMove() {
        assertTrue(board.makeMove(player, 2,2));
        assertFalse(board.makeMove(player, 12,12));
    }

    @Test
    public void printCurrentMoveData() {
        // prints on System.out - no need to test
    }

    @Test
    public void printGameData() {
        // prints on System.out - no need to test
    }

    @Test
    public void printGameMoves() {
        // prints on System.out - no need to test
    }

    @Test
    public void printBoard() {
        // prints on System.out - no need to test
    }
    @Test
    public void getMoveMadeTime() {
        board.makeMove(player,1,1);
        board.makeMove(player,12,12);
        board.makeMove(player,2,2);
        assertEquals(board.getMoveMadeTime(), 2);
    }
}