package com.jstarczewski;

public class Game {

    Game() {
        Player player = new Player();
        Board board = new Board();
        board.makeMove(player, 1,1);
        board.makeMove(player, 2,2);
        System.out.println(board.printBoard());

    }

}
