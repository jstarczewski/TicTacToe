package com.jstarczewski;

public class Configuration {

    Figure[][] configuration;

    Configuration() {
        this.configuration = new Figure[3][3];
    }
    Configuration(Configuration configuration) {
        rewrite(configuration);
    }

    public boolean fill(Figure figure, int width, int height) {
        if (isEmpty(width, height)) {
            configuration[width][height] = figure;
            return true;
        }
        else
            return false;
    }

    private boolean isEmpty(int width, int height) {
        return (configuration[width][height]) == null;
    }
    public void rewrite(Configuration configuration) {
        for (int i = 0; i<3; i++)
            for (int j = 0; j<3; j++) {
             this.configuration[i][j]=configuration.getConfiguration()[i][j];
            }
    }

    public Figure[][] getConfiguration() {
        return configuration;
    }
}
