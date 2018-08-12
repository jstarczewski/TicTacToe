package com.jstarczewski.Tests;

import com.jstarczewski.Player;
import com.jstarczewski.Tic;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicTest {

    private Tic tic;

    @org.junit.Before
    public void setUp() {
        tic = new Tic(4, 5, 0, new Player());
    }

    @Test
    public void isDefaultFigure() {
        assertFalse(tic.isDefaultFigure());
    }

    @Test
    public void getName() {
        assertEquals(tic.getName(), "| TIC |");
    }
}