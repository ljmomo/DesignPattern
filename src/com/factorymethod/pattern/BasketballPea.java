package com.factorymethod.pattern;

public class BasketballPea implements Pea {
	@Override
	public Player regPlayer() {
		return new BasketballPlayer();
	}

}
