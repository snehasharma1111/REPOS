package com.wiley.demos;

import com.wiley.demos.game.GameRunner;
import com.wiley.demos.game.SuperContraGame;
import com.wiley.demos.game.MarioGame;
import com.wiley.demos.game.PacmanGame;


public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new SuperContraGame();
		//var game = new MarioGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}
