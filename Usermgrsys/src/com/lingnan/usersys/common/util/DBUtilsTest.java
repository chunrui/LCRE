package com.lingnan.usersys.common.util;
import java.sql.Connection;
import org.junit.Test;
/**
 * ���Ӳ�����
 * @author Administrator
 *
 */
public class DBUtilsTest {

	/**
	 * ���ݿ����Ӳ��Է���
	 */
	public void testGetConnection() {
		Connection connection =DBUtils.getConnection();
		System.out.print(connection);
	}

}
