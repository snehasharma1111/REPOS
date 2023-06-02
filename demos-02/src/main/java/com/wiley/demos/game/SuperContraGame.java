package com.wiley.demos.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("jump again");
	}
	public void down() {
		System.out.println("hole again");
	}
	public void left() {
		System.out.println("back again");
	}
	public void right() {
		System.out.println("accelerate again");
	}
}
