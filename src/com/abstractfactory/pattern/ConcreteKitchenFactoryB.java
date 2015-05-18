package com.abstractfactory.pattern;

public class ConcreteKitchenFactoryB implements KitchenFactory {

	@Override
	public Food getFood() {
		return new Noodle();
	}

	@Override
	public TableWare getTableWare() {
		return new Chopsticks();
	}

}
