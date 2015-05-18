package com.observer.pattern;

import java.util.Observer;

public class TestJavaObserver {

	public static void main(String[] args) {
       //创建被观察者对象
		Watched watched = new Watched();
		//创建观察者对象
		Observer wather = new Watcher(watched);
		watched.setData("start");
		watched.setData("run");
		watched.setData("stop");
	}

}
