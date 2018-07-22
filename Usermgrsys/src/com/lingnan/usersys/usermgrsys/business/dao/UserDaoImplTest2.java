package com.lingnan.usersys.usermgrsys.business.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.Vector;

import org.junit.Test;

import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.usermgrsys.business.service.UserService;
import com.lingnan.usersys.usermgrsys.business.service.UserServiceImpl;
import com.lingnan.usersys.usermgrsys.domian.UserVO;
/**
 * �û�������2
 * @author Administrator
 *
 */
public class UserDaoImplTest2 {

	/**
	 * �û����Ҳ��Է���
	 */
	public void testFindAllUser() {
		Connection conn = DBUtils.getConnection();
		UserDao a = new UserDaoImpl(conn);
	    Vector<UserVO>  v= a.findAllUser();
	    System.out.println("���             �ǳ�               ����                       Ȩ��");
		for(UserVO user:v)
		{
			System.out.println(""+user.getAid()+"    "+user.getAname()+"          "+user.getApassword()+"     "+user.getPower()+"");
		}
	}
}
