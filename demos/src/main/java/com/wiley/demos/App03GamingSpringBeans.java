package com.wiley.demos;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wiley.demos.game.GameRunner;
import com.wiley.demos.game.GamingConsole;
import com.wiley.demos.game.SuperContraGame;
import com.wiley.demos.game.MarioGame;
import com.wiley.demos.game.PacmanGame;


public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext
		(GamingConfigurations.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		//var game = new SuperContraGame();
//		//var game = new MarioGame();
//		var game = new PacmanGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
	}
}
