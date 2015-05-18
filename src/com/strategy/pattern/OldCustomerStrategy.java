package com.strategy.pattern;

/**
 * 
 * 文件名称：OldCustomerStrategy
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月13日 上午9:31:32
 * @version 1.0.0
 * 备注:为老客户计算商品报价
 */
public class OldCustomerStrategy implements Strategy {

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("对于老客,户统一折扣5%");
		return goodsPrice*(1-0.05);
	}

}
