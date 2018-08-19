package com.jstarczewski.Game.Computer;

import com.jstarczewski.Game.Configuration;
import com.jstarczewski.Game.Stack;

import java.io.*;

public class WriteGame {

    public static boolean toTXT(Stack<Configuration> stack) {
        try {
            if (!stack.isEmpty()) {
                FileWriter fileWriter = new FileWriter("Games/game.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("HWDP");
                for (Configuration configuration : stack) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            bufferedWriter.write(configuration.getConfiguration()[i][j].toString());
                        }
                    }
                }
                fileWriter.close();
                bufferedWriter.close();
                return true;
            }
            return false;
        } catch (IOException e) {
            return false;
        }
    }

}
