package com.service;

import com.bean.Login;
import com.dao.LoginDao;

public class LoginService {
	public String checkLoginDetails(Login login) {
		LoginDao ld = new LoginDao();
		StringBuffer sb = new StringBuffer(login.getPassword());
		//sb.reverse();					
		login.setPassword(sb.reverse().toString());		// convert password in reverse order. 
		if(ld.checkLoginDetail(login)>0) {
			return "success";
		}else {
			return "failure";
		}
		
	
	}

}
