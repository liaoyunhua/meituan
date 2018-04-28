package com.bunfly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bunfly.dao.IUserDao;
import com.bunfly.model.User;
import com.bunfly.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao dao;

	@Override
	public List<User> query() throws RuntimeException {
		// TODO Auto-generated method stub
		return dao.query();
	}
	
	
	
}
