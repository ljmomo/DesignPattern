package com.factory.pattern;

public class FactoryPatternTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
        Food chicken = FoodFactory.getFood("kfcchicken");
        Food chips = FoodFactory.getFood("kfcchips");
        Food eggs = FoodFactory.getFood("eggs");
        
        if(chicken!=null)
         chicken.get();
        if(chips!=null)
         chips.get();
        /*if(eggs!=null)
         eggs.get();*/
	}

}
