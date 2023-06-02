package com.wiley.demos.game;

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
