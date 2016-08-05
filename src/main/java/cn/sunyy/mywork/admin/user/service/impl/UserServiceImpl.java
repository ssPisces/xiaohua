package cn.sunyy.mywork.admin.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sunyy.mywork.admin.user.dao.UserDao;
import cn.sunyy.mywork.admin.user.domain.User;
import cn.sunyy.mywork.admin.user.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired  
    private UserDao userDao;

	@Override
	public User selectUserById(Integer userId) {
		 return userDao.selectUserById(userId);  
	}

	@Override
	public User selectUserByUserName(String userName) {
		return userDao.selectUserByUserName(userName);
	}

}
