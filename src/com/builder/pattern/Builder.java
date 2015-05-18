package com.builder.pattern;
/*
 * 抽象构建者
 */
public abstract class Builder {
	
  public abstract void builderPartA();
  
  public abstract void builderPartB();
  
  public abstract Product getResult();
}
