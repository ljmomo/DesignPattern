package com.builder.pattern;
/*
 * 实际构建者2
 */
public class ConcreteBuilder2 extends Builder {
    
	private Product product = new Product();
	
	@Override
	public void builderPartA() {
		product.add("X部件");
	}

	@Override
	public void builderPartB() {
		product.add("Y部件");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
