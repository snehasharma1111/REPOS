package com.wiley.demos.example.a0;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan("com.wiley.demos.example.a1")
public class SimpleSpringContextLauncherApplication {

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
		(SimpleSpringContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
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
