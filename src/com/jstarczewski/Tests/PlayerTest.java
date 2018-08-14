package com.jstarczewski.Tests;

import com.jstarczewski.Figures.Figure;
import com.jstarczewski.Players.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    private Player player;

    @org.junit.Before
    public void setUp() {
        player = new Player();
    }

    @Test
    public void setTacAsFigure() {
        assertTrue(player.setTacAsFigure());
        assertFalse(player.setTacAsFigure());
    }

    @Test
    public void setTicAsFigure() {
        assertTrue(player.setTicAsFigure());
        assertFalse(player.setTicAsFigure());
    }

    @Test
    public void createFigure() {
        /*
        * Check wheter it is possible to set <0, <0 and moveMadeTime to <0
        * */
        Figure figure1 = player.createFigure(-1,-1, -1);
        assertEquals(figure1, null);
        player.setTacAsFigure();
        Figure figure2 = player.createFigure(-1,-1, -1);
        assertNotEquals(figure2, null);
    }

    @Test
    public void setMoveIndex() {
        player.setMoveIndex(20);
        assertEquals(player.getMoveIndex(), 20, 0);
    }

    @Test
    public void getMoveIndex() {
        // same as setMoveIndex()
    }

    @Test
    public void getFiguresName() {
        player.setTacAsFigure();
        assertEquals(player.getFiguresName(), "TAC");
    }
}