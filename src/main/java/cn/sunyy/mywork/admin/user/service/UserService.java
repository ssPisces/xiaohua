package cn.sunyy.mywork.admin.user.service;

import cn.sunyy.mywork.admin.user.domain.User;

public interface UserService {
	
	/**
	 * 功能：根据ID查询
	 * @param userId
	 * @return
	 */
	User selectUserById(Integer userId); 
	/**
	 * 功能：登录验证
	 * @param userName
	 * @return
	 */
	User selectUserByUserName(String userName);

}
