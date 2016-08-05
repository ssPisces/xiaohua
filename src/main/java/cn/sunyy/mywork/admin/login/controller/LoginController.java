package cn.sunyy.mywork.admin.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sunyy.mywork.admin.user.domain.User;
import cn.sunyy.mywork.admin.user.service.UserService;

@Controller
@RequestMapping("/admin")
public class LoginController {
	
	static Logger logger = Logger.getLogger(LoginController.class); 
	
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response){
		
		String userName = request.getParameter("userName");
		String userPassw = request.getParameter("paword");
		String checkBox = request.getParameter("checkbox");
		User  userInfo = userService.selectUserByUserName(userName);
		if(null != userInfo){
			if(userPassw.equals(userInfo.getUserPassword())){
				logger.info("������ȷ");
				
			}else{
				logger.info("�������");
			}
		}else{
			logger.info("�û������������");
		}
		
		if("on".equals(checkBox)){
			logger.info("��������");
			
			
		}
		
		
	}

}
