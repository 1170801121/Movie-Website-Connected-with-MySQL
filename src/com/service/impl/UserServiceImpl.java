package com.service.impl;

import com.interf.UserInterf;
import com.interf.impl.UserImpl;
import com.entity.User;
import com.service.UserService;
import com.util.TransactionManager;

public class UserServiceImpl implements UserService {
	private UserInterf userInterface = new UserImpl();
	@Override
	public User login(User user) {
		try {
			TransactionManager.begin();
			User queryUser = userInterface.queryByNameAndPass(user);
			TransactionManager.commit();
			return queryUser;
		} catch(Exception e) {
			e.printStackTrace();
			TransactionManager.rollback();
			return null;
		}
	}
	
	@Override
	public boolean register(User user) {
		try {
			TransactionManager.begin();
			boolean register = userInterface.register(user);
			TransactionManager.commit();
			return register;
		} catch(Exception e) {
			e.printStackTrace();
			TransactionManager.rollback();
			return false;
		}
	}

}
