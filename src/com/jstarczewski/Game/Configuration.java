package com.jstarczewski.Game;

import com.jstarczewski.Figures.Figure;

public class Configuration {

    private Figure[][] configuration;

    public Configuration() {
        this.configuration = new Figure[3][3];
        fillAtStart();
    }

    private void fillAtStart() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                this.configuration[i][j] = new Figure(i, j, 0);
            }
    }

    public boolean fill(Figure figure) {
        try {
            if (isFilledWithDefaultFigure(figure.getWidth(), figure.getHeight())) {
                configuration[figure.getHeight()][figure.getWidth()] = figure;
                return true;
            } else
                return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    private boolean isFilledWithDefaultFigure(int width, int height) {
        return (configuration[height][width]).isDefaultFigure();
    }

    public Configuration rewrite() {
        Configuration configuration = new Configuration();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                try {
                    configuration.getConfiguration()[i][j] = this.configuration[i][j];
                } catch (NullPointerException npe) {
                    configuration.getConfiguration()[i][j] = new Figure(i, j, 0);
                }
            }
        return configuration;
    }

    public Figure[][] getConfiguration() {
        return configuration;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                stringBuilder.append(configuration[i][j].getName());
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
