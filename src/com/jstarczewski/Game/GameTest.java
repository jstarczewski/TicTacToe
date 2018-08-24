package com.jstarczewski.Game;

import com.jstarczewski.Game.GamesSettings.Axis;
import com.jstarczewski.Game.GamesSettings.FiguresOrder;
import com.jstarczewski.Game.GamesSettings.Games;
import com.jstarczewski.Game.GamesSettings.MoveOrder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void setGameParticipants() {
        assertFalse(game.isGameParticipantsSet());
        game.setGameParticipants(Games.PLAYER_COMPUTER);
        assertTrue(game.isGameParticipantsSet());
    }

    @Test
    public void setFiguresOrder() {
        assertFalse(game.isFiguresOrderSet());
        game.setFiguresOrder(FiguresOrder.TAC_TIC);
        assertTrue(game.isFiguresOrderSet());
    }

    @Test
    public void setMoveOrder() {
        assertFalse(game.isMoveOrderSet());
        game.setMoveOrder(MoveOrder.FIRST_SECOND);
        assertTrue(game.isMoveOrderSet());
    }

    @Test
    public void setGameAxis() {
        assertFalse(game.isWidthAndHeightConverted());
        game.setGameAxis(Axis.POSITIVE_X_AND_NEGATIVE_Y);
        assertTrue(game.isWidthAndHeightConverted());
    }

    @Test
    public void runGame() {
        game.setGameParticipants(Games.PLAYER_PLAYER);
        game.setFiguresOrder(FiguresOrder.TAC_TIC);
        assertFalse(game.runGame() );

    }

    @Test
    public void printCurrentMoveData() {
        // will be visible in cmd
    }

    @Test
    public void printGameData() {
        // if all setters are set gonna print
    }

    @Test
    public void printBoard() {

    }

    @Test
    public void printGameMoves() {
    }

    @Test
    public void printHelp() {
    }
}