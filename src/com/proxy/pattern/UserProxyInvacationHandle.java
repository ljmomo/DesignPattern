package com.proxy.pattern;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserProxyInvacationHandle implements InvocationHandler {
    
	/**
	 * 创建一个新的实例 UserProxyInvacationHandle.
	 *
	 * @param obj
	 */
	public UserProxyInvacationHandle(Object obj) {
		this.obj = obj;
	}
	private Object obj;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("开启:"+method.getName()+"方法的事务");
		method.invoke(obj, args);
		System.out.println("提交:"+method.getName()+"方法的事务");
		return null;
	}

}
