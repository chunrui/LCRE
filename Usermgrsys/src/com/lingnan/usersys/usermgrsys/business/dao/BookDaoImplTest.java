package com.lingnan.usersys.usermgrsys.business.dao;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.usermgrsys.business.service.BookService;
import com.lingnan.usersys.usermgrsys.business.service.BookServiceImpl;
import com.lingnan.usersys.usermgrsys.domian.BookVO;
/**
 * ����ͼ��id�Ų�ѯ������
 * @author Administrator
 *
 */
public class BookDaoImplTest {

	/**
	 * ����ͼ��id�Ų�ѯ���Է���
	 */
	public void testFindBookByid() {
		int bid = 1;
		//�������ݿⷽ��
		Connection conn = DBUtils.getConnection();
		BookDao a = new BookDaoImpl(conn);
		BookVO book = null;
		//����ͼ���ѯ����
		book = a.findBookByid(bid);
		book.getBid();
		System.out.print(book.getBid());
	}

}
