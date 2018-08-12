package com.jstarczewski;

import com.jstarczewski.Players.Player;

public class Game {

    Game() {
        Player player = new Player();
        Board board = new Board();
        board.makeMove(player, 1, 1);
        board.makeMove(player, 2, 2);
        board.makeMove(player, 0, 0);
        board.makeMove(player, 4,4);
        board.printBoard();

    }

}
