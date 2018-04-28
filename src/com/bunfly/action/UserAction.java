package com.bunfly.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.bunfly.model.User;
import com.bunfly.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class UserAction extends ActionSupport implements ModelDriven<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	private IUserService ser;
	private List<User> list;
	
	
	public String query(){
		List<User> list = ser.query();
		System.out.println(list.size());
		setList(list);
		return SUCCESS;
	}


	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<User> getList() {
		return list;
	}


	public void setList(List<User> list) {
		this.list = list;
	}
}
