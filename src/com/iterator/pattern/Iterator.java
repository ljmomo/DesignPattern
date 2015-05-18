package com.iterator.pattern;

/**
 * 
 * 文件名称：Iterator
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月14日 上午10:36:08
 * 备注: 负责定义访问和遍历元素的接口
 * @version 1.0.0
 * 
 */
public interface Iterator {
	/**
	 * first(获取第一个元素)
	 * (这里描述这个方法适用条件 – 可选)
	 * @return 
	 *Item
	 * @exception 
	 * @since  1.0.0
	*/
	public Item first();

	/**
	 * next(获取下一个元素)
	 * (这里描述这个方法适用条件 – 可选)
	 * @return 
	 *Item
	 * @exception 
	 * @since  1.0.0
	*/
	public Item next();

	/**
	 * isDone(是否获取元素)
	 * (这里描述这个方法适用条件 – 可选)
	 * @return 
	 *boolean
	 * @exception 
	 * @since  1.0.0
	*/
	public boolean isDone();

	/**
	 * currentItem(获取实时的元素)
	 * (这里描述这个方法适用条件 – 可选)
	 * @return 
	 *Item
	 * @exception 
	 * @since  1.0.0
	*/
	public Item currentItem();
}
