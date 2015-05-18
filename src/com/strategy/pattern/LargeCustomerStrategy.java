package com.strategy.pattern;

/**
 * 
 * 文件名称：LargeCustomerStrategy
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月13日 上午9:37:25
 * 备注:为大客户计算商品报价
 * @version 1.0.0
 * 
 */
public class LargeCustomerStrategy implements Strategy {

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("对大客户,统一折扣10%");
		return goodsPrice*(1-0.1);
	}

}
