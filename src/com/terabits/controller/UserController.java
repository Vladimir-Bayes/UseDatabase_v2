package com.terabits.controller;


import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.terabits.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



/**   
 * @Description: 
 * <br>��վ��<a href="http://www.fkit.org">���Java</a> 
 * @author Ф�ļ�	36750064@qq.com   
 * @version V1.0   
 */

// Controllerע������ָʾ������һ��������������ͬʱ������������
@Controller
// RequestMapping��������ע��һ���������࣬��ʱ�����з�������ӳ��Ϊ������༶�������, 
// ��ʾ�ÿ������������е����󶼱�ӳ�䵽 value������ָʾ��·����
@RequestMapping(value="/user")
public class UserController{
	
	// ��̬List<User>���ϣ��˴��������ݿ���������ע����û���Ϣ
	private static List<User> userList;
	
	// UserController��Ĺ���������ʼ��List<User>����
	public UserController() {
		super();
		userList = new ArrayList<User>();
	}

	// ��̬����־��LogFactory
	private static final Log logger = LogFactory
            .getLog(UserController.class);

	// �÷���ӳ�������Ϊhttp://localhost:8080/context/user/register���÷���֧��GET����
	@RequestMapping(value="/register",method=RequestMethod.GET)
	 public String registerForm() {
		 logger.info("register GET����������...");
		 // ��ת��ע��ҳ��
	     return "registerForm";
	 }
	
	// �÷���ӳ�������Ϊhttp://localhost:8080/RequestMappingTest/user/register���÷���֧��POST����
	 @RequestMapping(value="/register",method=RequestMethod.POST)
	 // �������е�loginname������ֵ����loginname����,password��usernameͬ������
	 public String register(
			 @RequestParam("loginname") String loginname,
			 @RequestParam("password") String password,
			 @RequestParam("username") String username) {
		 logger.info("register POST����������...");
		 // ����User����
		 User user = new User();
		 user.setLoginname(loginname);
		 user.setPassword(password);
		 user.setUsername(username);
		 // ģ�����ݿ�洢User��Ϣ
		 userList.add(user);
		 // ��ת����¼ҳ��
	     return "loginForm";
	 }
	 
	// �÷���ӳ�������Ϊhttp://localhost:8080/RequestMappingTest/user/login
	 @RequestMapping("/login")
	 public String login(
			// �������е�loginname������ֵ����loginname����,passwordͬ������
			 @RequestParam("loginname") String loginname,
			 @RequestParam("password") String password,
			 Model model) {
		 logger.info("��¼��:"+loginname + " ����:" + password);
		 // �������в����û��Ƿ���ڣ��˴�����ģ�����ݿ���֤
		 for(User user : userList){
			 if(user.getLoginname().equals(loginname) 
					 && user.getPassword().equals(password)){
				 model.addAttribute("user",user);
				 return "welcome";
			 }
		 }
	     return "loginForm";
	 }

}

