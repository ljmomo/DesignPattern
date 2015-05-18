
package com.proxy.pattern;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		InvocationHandler ih = new UserProxyInvacationHandle(userDao);
		UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(userDao
				.getClass().getClassLoader(), userDao.getClass()
				.getInterfaces(), ih);
		userDaoProxy.save();
		userDaoProxy.delete();
	}

}
