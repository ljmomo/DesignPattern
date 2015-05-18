package com.observer.pattern;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
 
	
	
	/**
	 * 创建一个新的实例 Watcher.
	 *
	 */
	public Watcher(Observable i) {
		i.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
       System.out.println(""+((Watched)o).getData());
       try {
		Thread.sleep(1000*3);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

}
