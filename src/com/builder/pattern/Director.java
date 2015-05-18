package com.builder.pattern;

public class Director {
   public void Construct(Builder builder)
   {
	   builder.builderPartA();
	   builder.builderPartB();
   }
}
