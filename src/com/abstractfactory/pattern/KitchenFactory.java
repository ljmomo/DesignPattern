package com.abstractfactory.pattern;


/**
 * 
 * 文件名称：KitchenFactory
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月14日 上午8:35:55
 * 备注:抽象厨房工厂接口 ，主要用来制造食物和餐具 
 * @version 1.0.0
 * 
 */
public interface KitchenFactory {
     public Food getFood();
     public TableWare getTableWare();
}
