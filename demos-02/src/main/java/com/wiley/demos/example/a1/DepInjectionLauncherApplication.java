package com.wiley.demos.example.a1;
import java.util.Arrays;



import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class YourBusinessClass{
	
	Dependency1 dependency1;
	
	Dependency2 dependency2;
	
	
@Autowired	
public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Construction injection on YourBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}



//	public Dependency1 getDependency1() {
//		return dependency1;
//	}
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter injection on dependency 1");
//		this.dependency1 = dependency1;
//	}
//
//	public Dependency2 getDependency2() {
//		return dependency2;
//	}
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter injection on dependency 2");
//		this.dependency2 = dependency2;
//	}

	public String toString() {
		return "Using " + dependency1 + "and" + dependency2; 
	}
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}

@Configuration 
@ComponentScan("com.wiley.demos.example.a1")
public class DepInjectionLauncherApplication {

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
		(DepInjectionLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
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
