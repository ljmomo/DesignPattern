package com.observer.pattern;
/*
 * 存储有关状态，这些状态应与目标的状态保持一致。
 * 实现Observer的更新接口以使自身状态与目标的状态保持一致。
 * 在本角色内也可以维护一个指向Concrete Subject对象的引用。
 */
public class SymbolObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
       System.out.print("NumberGenerator:");
       int count = generator.getNumber(); 
       for (int i = 0; i < count; i++) {
		 System.out.print("*^_^*  ");
	   }
       System.out.println("");
       
      try {
		Thread.sleep(1000*3);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

}
