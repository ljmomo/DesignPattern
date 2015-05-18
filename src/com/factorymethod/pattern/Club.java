package com.factorymethod.pattern;

import org.junit.Test;

public class Club {
    private Player players;
    private Player playerh;
    private Player playerq;
    @Test
    public void test()
    {
    	Pea pea = new FootballPea();
    	this.playerq = pea.regPlayer();
    	this.playerh = pea.regPlayer();
    	playerh.run();
    	playerq.jump();
    }
}
