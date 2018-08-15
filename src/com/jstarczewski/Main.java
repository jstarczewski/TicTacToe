package com.jstarczewski;

import com.jstarczewski.Game.FiguresOrder;
import com.jstarczewski.Game.Game;
import com.jstarczewski.Game.Games;
import com.jstarczewski.Game.MoveOrder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Game game = new Game(Games.PLAYER_PLAYER, FiguresOrder.TIC_TAC, MoveOrder.FIRST_SECOND);
        Scanner scanner = new Scanner(System.in);


        int i = 0;
        while (i < 10) {
            i++;
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            if (game.makeMove(width, height))
                game.printBoard();
        }

    }
}
