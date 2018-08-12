package com.jstarczewski;

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
    }

    @org.junit.Test
    public void getHeight() {
    }

    @org.junit.Test
    public void getName() {
    }

    @org.junit.Test
    public void isDefaultFigure() {
    }
}