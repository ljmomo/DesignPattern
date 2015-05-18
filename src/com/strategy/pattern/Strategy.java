package com.strategy.pattern;


/**
 * 
 * 文件名称：Strategy
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月13日 上午9:24:38
 * @version 1.0.0
 * 
 */
/*
 * 策略接口
 * 定义计算报价算法的接口
 */
public interface Strategy {

	/**
	 * 计算应报的价格
	 * 
	 * @param goodsPrice 商品销售原价
	 * @return double  计算出来应该报给客户的价格
	 * @exception
	 * @since 1.0.0
	 */
	public double calcPrice(double goodsPrice);
}
