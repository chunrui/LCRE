package com.lingnan.usersys.usermgrsys.business.dao;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.usermgrsys.domian.UserVO;
/**
 * �û�������
 * @author Administrator
 *
 */
public class UserDaoImplTest {

/**
 * ��¼���Է���
 */
	public void testLogin() {
		//fail("Not yet implemented");
		Connection conn = DBUtils.getConnection();
		UserDao a = new UserDaoImpl(conn);
		String aid = "t03";
		String pass = "222222";
		UserVO uservo = a.login(aid, pass);
		String id = uservo.getAid();
		System.out.print(id);
	}
}
