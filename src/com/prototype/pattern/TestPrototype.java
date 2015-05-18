package com.prototype.pattern;

import java.io.IOException;

public class TestPrototype {
	/**
	 * main(这里用一句话描述这个方法的作用)
	 * (这里描述这个方法适用条件 – 可选)
	 * @param args
	 * @throws CloneNotSupportedException
	 * @throws ClassNotFoundException
	 * @throws IOException 
	 *void
	 * @exception 
	 * @since  1.0.0
	*/
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
       Prototype pt = new Prototype();
       Temp temp = new Temp();
       pt.setTemp(temp);
       pt.setStr("Hello World");
       System.out.println("是用浅克隆方法创建对象");
       Prototype pt1 = (Prototype)pt.clone();
       System.out.println("===========================");
       System.out.println("比较pt和pt1的Str的值");
       System.out.println(pt.getStr());
       System.out.println(pt1.getStr());
       
       System.out.println("修改pt1对象中str的值后，比较pt和pt1的str的值");
       pt1.setStr("你好世界");  
       System.out.println(pt.getStr());
       System.out.println(pt1.getStr());
       
       System.out.println("===========================");
       
       System.out.println("比较pt和pt1中temp对象的值");
       System.out.println(pt.getTemp());
       System.out.println(pt1.getTemp());
       
       System.out.println("使用深克隆方法进行创建对象");  
       System.out.println("============================"); 
       
       pt1 = (Prototype) pt.deepClone();
       System.out.println("是用深度克隆后比较pt和pt1中temp对象的值");
       System.out.println(pt.getTemp());
       System.out.println(pt1.getTemp());
       
	}
}
