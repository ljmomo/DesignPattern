package com.observer.pattern;
/*
 * 存储有关状态，这些状态应与目标的状态保持一致。
 * 实现Observer的更新接口以使自身状态与目标的状态保持一致。
 * 在本角色内也可以维护一个指向Concrete Subject对象的引用。
 */
public class NumberObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
        System.out.println("NumberObserver:"+generator.getNumber());
	    try {
			Thread.sleep(1000*3);//为了能清楚的看到输出，休眠3秒钟。 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
