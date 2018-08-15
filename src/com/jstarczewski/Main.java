package com.jstarczewski;

import com.jstarczewski.Game.FiguresOrder;
import com.jstarczewski.Game.Game;
import com.jstarczewski.Game.Games;
import com.jstarczewski.Game.MoveOrder;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Game game = new Game();
        game.setGameParticipants(Games.PLAYER_PLAYER);
        game.setFiguresOrder(FiguresOrder.TAC_TIC);
        game.setMoveOrder(MoveOrder.FIRST_SECOND);
        game.runGame();

    }
}
