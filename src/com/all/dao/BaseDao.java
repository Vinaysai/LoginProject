package com.all.dao;

import com.all.pojo.User;

public interface BaseDao {

	public boolean login(String username, String password);

	public String register(User user);
}
