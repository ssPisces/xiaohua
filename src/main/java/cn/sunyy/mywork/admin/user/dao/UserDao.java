package cn.sunyy.mywork.admin.user.dao;

import org.springframework.stereotype.Component;

import cn.sunyy.mywork.admin.user.domain.User;
@Component
public interface UserDao {
	
	/**
	 * 功能：根据ID查询
	 * @param userId
	 * @return
	 */
	public User selectUserById(Integer userId); 
	
	/**
	 *功能：根据用户名查询
	 * @param userName
	 * @return
	 */
	public User selectUserByUserName(String userName);
}
