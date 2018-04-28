package com.bunfly.service;

import java.util.List;

import com.bunfly.model.User;

public interface IUserService {

	List<User> query() throws RuntimeException;
}
