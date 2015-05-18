package com.factory.pattern;

public class FoodFactory {
	public static Food getFood(String str) throws InstantiationException, IllegalAccessException {
		if(str.equals("kfcchicken"))
		{
			return KfcChicken.class.newInstance();
		}
		else if(str.equals("kfcchips"))
		{
			return KfcChips.class.newInstance();
		}
		else
		{
			System.out.println("KFC没有你要的食物");
			return null;
		}
		

	}
}
