package com.factorymethod.pattern;

public class BasketballPlayer implements Player {

	@Override
	public void run() {
		System.out.println("篮球运动员跑............");

	}

	@Override
	public void jump() {
		System.out.println("篮球运动员跳............");
	}

}
