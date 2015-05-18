package com.command.pattern;

import java.util.Iterator;
import java.util.List;

public class TestCommand {

	public static void main(String[] args) {
        List queue = Producer.producerRequests();
        for (Iterator i =queue.iterator();i.hasNext();) {
        //客户端直接调用 execute 方法，无需知道被调用者的其它更多类的方法名。
		   ((Command)i.next()).execute();	
		}
	}

}
