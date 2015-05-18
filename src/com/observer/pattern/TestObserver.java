package com.observer.pattern;

public class TestObserver {
	public static void main(String[] args) {
        //实例化数字产生对象
		NumberGenerator generator = new RandomNumberGenerator();
		
		//实例化观察者
		
		Observer observer1 = new NumberObserver();
		
		Observer observer2 = new SymbolObserver();
		
		//注册观察者
		generator.addObserver(observer1);
		
		generator.addObserver(observer2);
		
		generator.generate(); //生产数字
	}

}
