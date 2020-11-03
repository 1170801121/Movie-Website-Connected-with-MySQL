package com.interf;

import com.entity.User;

public interface UserInterf {
	public abstract User queryByNameAndPass(User user);
	public abstract boolean register(User user);
}
