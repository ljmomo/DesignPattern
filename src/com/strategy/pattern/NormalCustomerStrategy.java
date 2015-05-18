package com.strategy.pattern;

/**
 * 
 * 文件名称：NormalCustomerStrategy
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月13日 上午9:28:56
 * @version 1.0.0
 * 备注：具体算法实现 为新客户和普通客户计算应报的价格
 */
public class NormalCustomerStrategy implements Strategy {

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("对于新客户和普通客户没有优惠");
		return goodsPrice;
	}

}
