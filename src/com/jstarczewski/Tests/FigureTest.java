package com.jstarczewski.Tests;

import com.jstarczewski.Figures.Figure;

import static org.junit.Assert.*;

public class FigureTest {

    private Figure figure;

    @org.junit.Before
    public void setUp() {
        figure = new Figure(3, 3, 2);
    }

    @org.junit.Test
    public void getMoveMadeTime() {
        assertEquals(figure.getMoveMadeTime(), 2, 0);
    }

    @org.junit.Test
    public void getWidth() {
        assertEquals(figure.getWidth(), 3,0);
    }

    @org.junit.Test
    public void getHeight() {
        assertEquals(figure.getHeight(), 3,0);
    }

    @org.junit.Test
    public void getName() {
        assertEquals(figure.getName(), "|     |");
    }

    @org.junit.Test
    public void isDefaultFigure() {
        assertTrue(figure.isDefaultFigure());
    }
}