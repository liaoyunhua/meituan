package com.bunfly.dao;

import java.util.List;

import com.bunfly.model.User;

public interface IUserDao {

	List<User> query() throws RuntimeException;
}
