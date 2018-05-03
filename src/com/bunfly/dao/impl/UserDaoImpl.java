package com.bunfly.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.bunfly.dao.IUserDao;
import com.bunfly.model.User;

@Repository
public class UserDaoImpl implements IUserDao{
 
	@Resource
	private SessionFactory fac;

	@Override
	public List<User> query() throws RuntimeException {
		String hql = "from User";
		Session session = fac.openSession();
		List<User> list = session.createQuery(hql).list();
		session.close();
		return list;
	}

}
