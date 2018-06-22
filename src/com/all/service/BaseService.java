package com.all.service;

import com.all.pojo.User;

public interface BaseService {

	public boolean login(String username, String password);

	public String registration(User user);

}
