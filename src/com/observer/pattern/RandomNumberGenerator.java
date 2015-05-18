package com.observer.pattern;

import java.util.Random;
/*
 * 具体目标角色（Concrete Subject）：将有关状态存入各个Concrete Observer对象。
 * 当它的状态发生改变时, 向它的各个观察者发出通知。
 */
public class RandomNumberGenerator extends NumberGenerator {
 
	private Random random = new Random();//随机数生成器
	
	private int number;//用于存放数据
	
	
	@Override
	public int getNumber() {
		return number;
	}

	/* 
	 * 用于产生随机数及通知观察者的类  
	 */
	@Override
	public void generate() {
      for (int i = 0; i < 5; i++) {
		number = random.nextInt(10);
		notifyObserver(); //有新产生的数字，通知所有注册的观察者 
	  }
	}

}
