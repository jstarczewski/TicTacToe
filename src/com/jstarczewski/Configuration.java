package com.jstarczewski;

public class Configuration {

    private Figure[][] configuration;

    Configuration() {
        this.configuration = new Figure[3][3];
        fillAtStart();
    }

    private void fillAtStart() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                this.configuration[i][j] = new Figure(i, j, 0);
            }
    }

    public boolean fill(Figure figure, int width, int height) {
        try {
            if (isFilledWithDefaultFigure(width, height)) {
                configuration[width][height] = figure;
                return true;
            } else
                return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    private boolean isFilledWithDefaultFigure(int width, int height) {
        return (configuration[width][height]).isDefaultFigure();
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
        String base = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                base += configuration[i][j].getName();
            }
            base += '\n';
        }
        return base;
    }
}
