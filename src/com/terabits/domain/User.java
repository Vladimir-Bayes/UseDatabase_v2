package com.terabits.domain;

import java.io.Serializable;

/**   
 * @Description: 
 * <br>��վ��<a href="http://www.fkit.org">���Java</a> 
 * @author Ф�ļ�	36750064@qq.com   
 * @version V1.0   
 */

// �����ʵ�����л��ӿ�
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// ˽���ֶ�
	private String loginname;
	private String password;
	private String username;
	
	// ����������
	public User() {
		super();
	}
	// set/get����
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
