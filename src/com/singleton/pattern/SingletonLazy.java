package com.singleton.pattern;

public class SingletonLazy {
   private SingletonLazy (){};
   private static SingletonLazy singletonLazy =null;
   
   public static synchronized SingletonLazy getInstance()
   {
	    if(singletonLazy==null)
	    {
	    	singletonLazy = new SingletonLazy();
	    }
	   return singletonLazy;
   }
   
   
}
