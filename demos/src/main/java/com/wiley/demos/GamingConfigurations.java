package com.wiley.demos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wiley.demos.game.GameRunner;
import com.wiley.demos.game.GamingConsole;
import com.wiley.demos.game.PacmanGame;

@Configuration
public class GamingConfigurations {

	
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
//	//var game = new SuperContraGame();
//	//var game = new MarioGame();
//	var game = new PacmanGame();
//	var gameRunner = new GameRunner(game);
//	gameRunner.run();
}
