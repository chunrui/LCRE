package com.lingnan.usersys.usermgrsys.business.service;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import com.lingnan.usersys.usermgrsys.domian.UserVO;
/**
 * �û�service�������2
 * @author Administrator
 *
 */
public class UserServiceImplTest2 {

	/**
	 * �û�service����Ҳ��Է���
	 */
	public void testFindAllUser() {
		    UserService usermgrService =  UserServiceImpl.getInstance();
			
		    Vector<UserVO>  v= usermgrService.findAllUser();
		    System.out.println("���             �ǳ�               ����                       Ȩ��");
			for(UserVO user:v)
			{
				System.out.println(""+user.getAid()+"    "+user.getAname()+"          "+user.getApassword()+"     "+user.getPower()+"");
			}
	}

}
