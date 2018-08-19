package com.jstarczewski.Game.Computer;

import com.jstarczewski.Game.Configuration;

import java.util.ArrayList;

public class Analyzer {

    private ArrayList<String> rawConfigurations = new ArrayList<>();
    private Configuration configurationPattern;


    public Analyzer(ConfigurationsScanner configurationsScanner, Configuration configurationPattern) {
        rawConfigurations = configurationsScanner.getConfigurations();
        this.configurationPattern = configurationPattern;
    }

}
