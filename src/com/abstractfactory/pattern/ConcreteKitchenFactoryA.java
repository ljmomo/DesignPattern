package com.abstractfactory.pattern;

/**
 * 
 * 文件名称：ConcreteKitchenFactoryA
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月14日 上午8:37:18
 * 备注:实际的厨房工厂A  生产了 真的食物 牛奶  和真正的餐具勺子
 * @version 1.0.0
 * 
 */
public class ConcreteKitchenFactoryA implements KitchenFactory {

	@Override
	public Food getFood() {
		return new Milk();
	}

	@Override
	public TableWare getTableWare() {
		return new Spoon();
	}

}
