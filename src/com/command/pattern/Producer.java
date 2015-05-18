 package com.command.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 文件名称：Producer
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月14日 下午2:46:15
 * 备注:将命令封装到黑盒子 （这里是List中）
 * @version 1.0.0
 * 
 */
public class Producer { 
	 public static List<Command> producerRequests()
	 {
		 List<Command> queue = new ArrayList<Command>();
		 queue.add(new Engineer());
		 queue.add(new Programmer());
		 queue.add(new Politician());
		 return queue;
		 
	 }
}
