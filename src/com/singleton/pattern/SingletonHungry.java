package com.singleton.pattern;

public class SingletonHungry {
	private static SingletonHungry singleton = new SingletonHungry();
	/**
	 * 创建一个新的实例 Singleton.
	 *
	 */
	private SingletonHungry() {
	}
	public static  SingletonHungry getInstance()
	{
		return singleton;
		
	}
}
