package com.jstarczewski.Game.Computer;

import com.jstarczewski.Figures.Figure;
import com.jstarczewski.Game.Configuration;
import com.jstarczewski.Game.Stack;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class GameWriter {

    public static boolean toTXT(Stack<Configuration> stack) {
        try {
            if (!stack.isEmpty()) {
                PrintWriter printWriter = new PrintWriter(new FileOutputStream("Games/game.txt", true));
                Figure[][] configuration = stack.pop().getConfiguration();
                ArrayList<String> configurations = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        configurations.add(configuration[i][j].toString());
                    }
                }
                Collections.sort(configurations);
                for (String string : configurations)
                    printWriter.println(string);
                printWriter.println("---");
                printWriter.close();
                return true;
            }
            return false;
        } catch (IOException e) {
            return false;
        }
    }

}
