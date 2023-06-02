package com.wiley.demos.game;
import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{

	public void up() {
		System.out.println("yess");
	}
	public void down() {
		System.out.println("nooo");
	}
	public void left() {
		System.out.println("here");
	}
	public void right() {
		System.out.println("there");
    }
}
