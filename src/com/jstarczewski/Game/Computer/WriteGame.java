package com.jstarczewski.Game.Computer;

import com.jstarczewski.Game.Configuration;
import com.jstarczewski.Game.Stack;

import java.io.*;

public class WriteGame {

    public static boolean toTXT(Stack<Configuration> stack) {
        try {
            if (!stack.isEmpty()) {
                File file = new File("Games/game.txt");
                PrintWriter printWriter = new PrintWriter(file);
                for (Configuration configuration : stack) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            printWriter.println(configuration.getConfiguration()[i][j].toString());
                        }
                    }
                    printWriter.println(" ");
                }
                printWriter.close();
                return true;
           }
            return false;
        } catch (IOException e) {
            return false;
        }
    }

}
