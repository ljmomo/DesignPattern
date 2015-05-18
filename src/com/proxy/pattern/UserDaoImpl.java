package com.proxy.pattern;


public class UserDaoImpl implements UserDao {
	@Override
	public void save() {
		 System.out.println("=====真实的保存对象");
	}

	@Override
	public void delete() {
		 System.out.println("=====真实的删除对象");
		
	}

}
