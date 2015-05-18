package com.strategy.pattern;

/**
 * 
 * 文件名称：Price
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月13日 上午9:43:51
 * 备注:价格管理，主要完成计算向客户所报价格的功能 
 * @version 1.0.0
 * 
 */
public class Price {
  
	private Strategy strategy = null;
	/**
	 * 创建一个新的实例 Price.
	 * @param strategy
	 *  备注:构造方法，传入一个具体的策略对象
	 */
	public Price(Strategy strategy) {
		this.strategy = strategy;
	}
	
	
	/**
	 * quote(计算对客户的博爱家)
	 * @param goodsPrice 商品原价
	 * @return double  计算出来的，应该给客户报的价格 
	 * @exception 无
	 * @since  1.0.0
	*/
	public double quote(double goodsPrice)
	{
		return this.strategy.calcPrice(goodsPrice);
	}
}
