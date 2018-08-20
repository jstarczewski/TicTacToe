package com.jstarczewski.Game.Computer;

import com.jstarczewski.Game.Configuration;

import java.io.*;
import java.util.ArrayList;

public class ConfigurationsScanner {

    private Configuration configurationPattern;
    private ArrayList<ArrayList<String>> rawConfigurations;

    public ConfigurationsScanner() {
        this.rawConfigurations = scanGamesToMatchCurrentPattern();
    }

    private ArrayList<ArrayList<String>> scanGamesToMatchCurrentPattern() {
        rawConfigurations = new ArrayList<>();
        ArrayList<String> configuration = new ArrayList<>();
        File file = new File("Games/game.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String rawConfigurationLine;
            while ((rawConfigurationLine = bufferedReader.readLine()) != null) {
                if (rawConfigurationLine.equals("---")) {
                    rawConfigurations.add(configuration);
                    configuration = new ArrayList<>();
                }
                else {
                    configuration.add(rawConfigurationLine);
                }
            }
        } catch (IOException e) {
            System.err.println("Unable to read File");
            return rawConfigurations;
        }
        return rawConfigurations;
    }


    public ArrayList<ArrayList<String>> getRawConfigurations() {
        return rawConfigurations;
    }

    public void setRawConfigurations(ArrayList<ArrayList<String>> rawConfigurations) {
        this.rawConfigurations = rawConfigurations;
    }
}
