package com.strategy.pattern;

import org.junit.Test;

public class Client {
	/**
	 * getPrice(测试大客户) (这里描述这个方法适用条件 – 可选) void
	 * 
	 * @exception
	 * @since 1.0.0
	 */
	@Test
	public void getPrice() {
		// 选择并创建需要使用的策略对象 此处为大客户
		Strategy strategy = new LargeCustomerStrategy();
		// 创建上下文
		Price price = new Price(strategy);
		// 计算报价
		double quote = price.quote(1000);
		System.out.println("向客户报价：" + quote);
	}

	@Test
	public void getNormalPrice() {
		// 选择并创建需要使用的策略对象 此处为普通客户和新客户
		Strategy strategy = new NormalCustomerStrategy();
		// 创建上下文
		Price price = new Price(strategy);
		// 计算报价
		double quote = price.quote(1000);
		System.out.println("向客户报价：" + quote);
	}
	
	@Test
	public void getOldPrice() {
		// 选择并创建需要使用的策略对象 此处为老客户
		Strategy strategy = new OldCustomerStrategy();
		// 创建上下文
		Price price = new Price(strategy);
		// 计算报价
		double quote = price.quote(1000);
		System.out.println("向客户报价：" + quote);
	}

}
