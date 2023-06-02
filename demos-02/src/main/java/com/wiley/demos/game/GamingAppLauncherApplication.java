package com.wiley.demos.game;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration @Qualifier("SuperContraGameQualifier")
@ComponentScan("com.wiley.demos.game")
public class GamingAppLauncherApplication {

//	@Bean 
//	public GamingConsole game() {
//		var game = new PacmanGame();
//		return game;
//	}
	
	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		System.out.println("Parameter: " + game);
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext
		(GamingAppLauncherApplication.class)) {
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
