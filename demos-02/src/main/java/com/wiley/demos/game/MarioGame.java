package com.wiley.demos.game;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("jump");
	}
	public void down() {
		System.out.println("hole");
	}
	public void left() {
		System.out.println("back");
	}
	public void right() {
		System.out.println("accelerate");
	}
}
