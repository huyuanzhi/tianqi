package com.tianqi.service.user.impl;


import com.tianqi.common.dao.BaseDao;
import com.tianqi.common.service.BaseServiceImpl;

import com.tianqi.dao.mapper.UserMapper;
import com.tianqi.model.user.User;
import com.tianqi.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User>
		implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	protected BaseDao<User> getDao() {
		return userMapper;
	}

	@Override
	public Integer findAll() {
		return userMapper.findAll();
	}

	@Override
	public User findOneByUsername(String username) {
		return userMapper.findOneByUsername(username);
	}

	@Override
	public void changePassword(User user) {
		userMapper.changePassword(user);
	}
}
