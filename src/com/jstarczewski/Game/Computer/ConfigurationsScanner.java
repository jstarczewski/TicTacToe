package com.jstarczewski.Game.Computer;

import com.jstarczewski.Game.Configuration;

import java.io.*;
import java.util.ArrayList;

public class ConfigurationsScanner {

    private Configuration configurationPattern;

    private ArrayList<String> configurations;

    public ConfigurationsScanner() {
        this.configurations = scanGamesToMatchCurrentPattern();
    }

    private ArrayList<String> scanGamesToMatchCurrentPattern() {
        configurations = new ArrayList<>();
        File file = new File("Games/game.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String rawFishCard;
            while ((rawFishCard = bufferedReader.readLine()) != null) {
                configurations.add(rawFishCard);
            }
        } catch (IOException e) {
            System.err.println("Unable to read File");
            return configurations;
        }
        return configurations;
    }

    public ArrayList<String> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(ArrayList<String> configurations) {
        this.configurations = configurations;
    }

}
