package com.jstarczewski.Tests;

import com.jstarczewski.Figures.Figure;
import com.jstarczewski.Figures.Tac;
import com.jstarczewski.Figures.Tic;
import com.jstarczewski.Game.Configuration;
import com.jstarczewski.Players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConfigurationTest {

    private Configuration configuration;

    @Before
    public void setUp() {
        configuration = new Configuration();
    }

    @Test
    public void fill() {
        assertTrue(configuration.fill(new Tac(2,2,3, new Player())));
        assertFalse(configuration.fill(new Tac(2,2, 4,new Player())));
        assertTrue(configuration.fill(new Tic(1,1,3, new Player())));
        assertFalse(configuration.fill(new Tic(-1, 231, 20, new Player())));
    }

    @Test
    public void rewrite() {
        Configuration configuration = this.configuration.rewrite();
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                assertEquals(configuration.getConfiguration()[i][j], this.configuration.getConfiguration()[i][j]);
            }
        }
    }

    @Test
    public void getConfiguration() {
        Figure[][] configuration = this.configuration.getConfiguration();
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                assertEquals(configuration[i][j], this.configuration.getConfiguration()[i][j]);
            }
        }
        // getter must be working right, cant easily check 2 dim array
    }
}