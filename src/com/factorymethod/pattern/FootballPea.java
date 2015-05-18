package com.factorymethod.pattern;

public class FootballPea implements Pea {
	@Override
	public Player regPlayer() {
		return new FootballPlayer();
	}

}
