package com.observer.pattern;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 抽象目标角色（Subject）：目标角色知道它的观察者，
 * 可以有任意多个观察者观察同一个目标。
 * 并且提供注册和删除观察者对象的接口。
 * 目标角色往往由抽象类或者接口来实现。
 */

public abstract class NumberGenerator {
	// 抽象的目标角色知道观察他的人 有哪些
	private ArrayList observers = new ArrayList();// 存储Oberserver

	/*
	 * 添加观察者
	 */
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	/*
	 * 删除观察者
	 */
	public void delObserver(Observer observer) {
		observers.remove(observer);
	}

	/*
	 * 通知所有观察者
	 */
	public void notifyObserver() {
		Iterator it = observers.iterator();
		while (it.hasNext()) {
			Observer o = (Observer) it.next();
			o.update(this);
		}
	}

	public abstract int getNumber();// 获取数字

	public abstract void generate();// 产生数字

}
