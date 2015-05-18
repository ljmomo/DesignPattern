package com.builder.pattern;
/*
 * 实际构建者
 */
public class ConcreteBuilder1 extends Builder {
    
	 private Product product = new Product();
	
	@Override
	public void builderPartA() {
		product.add("部件A");
	}

	@Override
	public void builderPartB() {
		product.add("部件B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
