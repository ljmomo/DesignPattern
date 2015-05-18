package com.abstractfactory.pattern;

public class Client {
	/*
	 * 测试
	 */
   public void eat(KitchenFactory k)
   {
	   System.out.println("A person eat "+k.getFood().getEatable()  
	             +" with "+k.getTableWare().getTool()+"!");  
   }
   public static void main(String[] args) {
	Client client = new Client();
	KitchenFactory kf = new ConcreteKitchenFactoryA();
	client.eat(kf);
	KitchenFactory kf2 = new ConcreteKitchenFactoryB();
	client.eat(kf2);
}
}
