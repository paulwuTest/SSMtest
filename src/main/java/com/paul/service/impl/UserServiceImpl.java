  package com.paul.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.paul.dao.IUserDao;
import com.paul.domain.User;
import com.paul.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	 @Resource  
	  private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}

}
