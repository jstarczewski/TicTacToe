package com.jstarczewski;

import com.jstarczewski.Game.*;
import com.jstarczewski.Game.Computer.Analyzer;
import com.jstarczewski.Game.Computer.ConfigurationsScanner;
import com.jstarczewski.Game.GamesSettings.Axis;
import com.jstarczewski.Game.GamesSettings.FiguresOrder;
import com.jstarczewski.Game.GamesSettings.Games;
import com.jstarczewski.Game.GamesSettings.MoveOrder;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Game game = new Game();
        Analyzer analyzer = new Analyzer(new ConfigurationsScanner());
        game.printHelp();
        game.setGameParticipants(Games.PLAYER_COMPUTER);
        game.setFiguresOrder(FiguresOrder.TAC_TIC);
        game.setMoveOrder(MoveOrder.FIRST_SECOND);
        game.setGameAxis(Axis.POSITIVE_X_AND_NEGATIVE_Y);
        game.printGameData();
        game.runGame();

    }
}
