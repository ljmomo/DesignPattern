package com.factorymethod.pattern;

public class FootballPlayer implements Player {

	@Override
	public void run() {

		System.out.println("足球运动员跑...........");
	}

	@Override
	public void jump() {
		System.out.println("足球运动员跳...........");

	}

}
