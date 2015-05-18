package com.builder.pattern;

import org.junit.Test;

public class TestBuilder {
   @Test
   public void  buliderProduct()
   {
	   
	   Director director = new Director();
	   Builder builder1 = new ConcreteBuilder1();
	   Builder builder2 = new ConcreteBuilder2();
	   
	   //创建产品1  用指导者来创建部件的各个部分
	   director.Construct(builder1);
	   Product p1 = builder1.getResult();
	   p1.show();
	    //创建产品2  用指导者来创建部件的各个部分
	    director.Construct(builder2);
	    Product p2 = builder2.getResult();
	    p2.show();
	    
   }
}
