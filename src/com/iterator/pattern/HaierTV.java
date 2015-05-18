package com.iterator.pattern;

import java.util.Vector;

public class HaierTV implements Television {
    
	


	private Vector channel;
	/**
	 * 创建一个新的实例 HaierTV.
	 *
	 */
	public HaierTV() {
		channel = new Vector();
		channel.addElement(new Item("channel1"));
		channel.addElement(new Item("channel2"));
		channel.addElement(new Item("channel3"));
		channel.addElement(new Item("channel4"));
		channel.addElement(new Item("channel5"));
		channel.addElement(new Item("channel6"));
		channel.addElement(new Item("channel7"));
	
	}
	
	
	@Override
	public Iterator createIterator() {
		return new Controller(channel);
	}

	@Override
	public Vector getChannel() {
		return channel;
	}

}
