package com.iterator.pattern;

import java.util.Vector;

public class Controller implements Iterator {
   
	private int current = 0;
	
	Vector channel ;
	
	
	  
	
	/**
	 * 创建一个新的实例 Controller.
	 *
	 * @param channel
	 */
	public Controller(Vector channel) {
		this.channel = channel;
	}

	@Override
	public Item first() {
		current = 0;
		return (Item) channel.get(current);
	}

	@Override
	public Item next() {
		current++;
		return (Item) channel.get(current);
	}

	@Override
	public boolean isDone() {
		return current>=channel.size()-1;
	}

	@Override
	public Item currentItem() {
		return (Item)channel.get(current);
	}

}
