package com.jstarczewski.Tests;

import com.jstarczewski.Players.Player;
import com.jstarczewski.Figures.Tac;
import org.junit.Test;

import static org.junit.Assert.*;

public class TacTest {

    private Tac tac;

    @org.junit.Before
    public void setUp() {
        tac = new Tac(4,5,0, new Player());
    }

    @Test
    public void isDefaultFigure() {
        assertFalse(tac.isDefaultFigure());
    }

    @Test
    public void getName() {
        assertEquals(tac.getName(), "| TAC |");
    }

}