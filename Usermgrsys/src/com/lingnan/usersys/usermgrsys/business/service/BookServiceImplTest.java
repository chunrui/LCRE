package com.lingnan.usersys.usermgrsys.business.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lingnan.usersys.usermgrsys.domian.BookVO;
import com.lingnan.usersys.usermgrsys.domian.UserVO;
/**
 * ͼ�������
 * @author Administrator
 *
 */
public class BookServiceImplTest {

	/**
	 *  ����ͼ��id�ò���ͼ����Ϣ�Ĳ��Է���
	 */
	public void testFindBookByid() {
		BookService bookmgrService =  BookServiceImpl.getInstance();
		int bid = 1;
		BookVO book = bookmgrService.findBookByid(bid);
		int id =book.getBid();
		System.out.print(id);
	}

}
