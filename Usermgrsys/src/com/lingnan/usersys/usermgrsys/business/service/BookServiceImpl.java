package com.lingnan.usersys.usermgrsys.business.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.lingnan.usersys.common.constant.EnumType;
import com.lingnan.usersys.common.dao.BookFactory;
import com.lingnan.usersys.common.dao.DaoFactory;
import com.lingnan.usersys.common.exception.DaoException;
import com.lingnan.usersys.common.exception.ServiceException;
import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.usermgrsys.business.dao.BookDao;
import com.lingnan.usersys.usermgrsys.business.dao.UserDao;
import com.lingnan.usersys.usermgrsys.domian.BookVO;
/**
 * ͼ��ʵ����
 * @author Administrator
 *
 */
public class BookServiceImpl implements  BookService{
	/**
	 * ����һ��bookservice
	 */
	private static BookService bookservice = new BookServiceImpl();
	/**
	 * ˽�еĹ��췽��
	 */
	private BookServiceImpl(){
		
	}
	/**
	 * ͨ��getInstance()��ȡUserService
	 * @return
	 */
	public static BookService getInstance()
	{
		return bookservice; 
	}

	/**
	 * ���ͼ�鷽��
	 * @param book ͼ�����
	 * @return  ����true����false
	 */
	public boolean addBook(BookVO book) {
		// TODO Auto-generated method stub
		Connection conn = null;
		//UserVO user = null;
		//�������������ڼ�¼��ӽ������ֵ
		boolean result =false;
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			BookDao bookMrgDao = (BookDao) BookFactory.getBaseDao(conn, EnumType.BOOK_DAO);
			//��������
			DBUtils.beginTransaction(conn);
			//user.setPower(2);
			//����dao��adduser�����������������ݿ��������������������result����
			result = bookMrgDao.addBook(book);
			//�ύ����
			DBUtils.commit(conn);
	}catch(Exception e){
		DBUtils.rollback(conn);
		System.out.print("���ʧ�ܣ�"+e.getMessage());
	}finally{
		
	}
		//���ؽ��
		return result;
	}

	/**
	 * ����ͼ����Ϣ
	 * @param book ͼ�����
	 * @return  ����true����false
	 */
	public boolean updateBook(BookVO book) {
		// TODO Auto-generated method stub
		Connection conn = null;
		//UserVO user = null;
		//�������������ڼ�¼��ӽ������ֵ
		boolean result =false;
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			BookDao userMrgDao= (BookDao) BookFactory.getBaseDao(conn, EnumType.BOOK_DAO);
			//��������
			DBUtils.beginTransaction(conn);
			//user.setPower(2);
			//����dao��adduser�����������������ݿ��������������������result����
			result = userMrgDao.updateBook(book);
			//�ύ����
			DBUtils.commit(conn);
	}catch(Exception e){
		DBUtils.rollback(conn);
		System.out.print("�޸�ʧ�ܣ�"+e.getMessage());
	}finally{
		DBUtils.closeConnection(conn);
	}
		//���ؽ��
		return result;
	}
	/**
	 * ����id�Ų���ͼ��
	 * @param bid ͼ��id��
	 * @return ����ͼ�����
	 */
	public BookVO findBookByid(int bid) {
		//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
		Connection conn = null;
		BookVO book = null;
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			BookDao bookMrgDao= (BookDao) BookFactory.getBaseDao(conn, EnumType.BOOK_DAO);
			book = bookMrgDao.findBookByid(bid);
		} catch (Exception e) {
			//�Զ����쳣��
			System.out.print("ͼ�����ʧ�ܣ�"+e.getMessage());
		}finally{
			//���ݿ�ر�
			DBUtils.closeConnection(conn);
		}	
		return book;					  
	}

	
/**
 * ��������ͼ����Ϣ
 * @return ����ͼ�����
 */
	public Vector<BookVO> findAllBook() {
		Connection conn = null;
		BookVO book = null;
		Vector<BookVO> v = new Vector<BookVO>();
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			BookDao bookMrgDao= (BookDao) BookFactory.getBaseDao(conn, EnumType.BOOK_DAO);
			v = bookMrgDao.findAllBook();
		} catch (DaoException e) {
			throw e;
		}catch (Exception e) {
			//�Զ����쳣��
			throw new ServiceException("ͼ�����ʧ�ܡ�����"+e.getMessage());
		}finally{
			//���ݿ�ر�
			DBUtils.closeConnection(conn);
		}	
		return v;	
	}

	/**
	 * ����id�ú�ɾ��ͼ��
	 * @param  bid ͼ��id��
	 * @return ����true����false
	 */
	public boolean deleteBookByid(int bid) {
		// TODO Auto-generated method stub
		Connection conn = null;
		//UserVO user = null;
		//�������������ڼ�¼��ӽ������ֵ
		boolean result =false;
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			BookDao bookMrgDao= (BookDao) BookFactory.getBaseDao(conn, EnumType.BOOK_DAO);			//��������
			DBUtils.beginTransaction(conn);
			
			//����dao��adduser�����������������ݿ��������������������result����
			result = bookMrgDao.deleteBookByid(bid);
			//�ύ����
			DBUtils.commit(conn);
			
	}catch(Exception e){
		DBUtils.rollback(conn);
		System.out.print("ɾ���û���Ϣʧ�ܣ�"+e.getMessage());
	}finally{
		DBUtils.closeConnection(conn);
	}
		//���ؽ��
		return result;
	}
	/**
	 * ����ͼ��������ͼ����Ϣ
	 * @param  name ͼ����
	 * @return ����Vector<BookVO>
	 */
	public Vector<BookVO> findBookByName(String name) {
		//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
		Connection conn = null;
		BookVO book = null;
		Vector<BookVO>  v = new Vector<BookVO>();
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			BookDao bookMrgDao= (BookDao) BookFactory.getBaseDao(conn, EnumType.BOOK_DAO);
			v = bookMrgDao.findBookByName(name);
		} catch (Exception e) {
			//�Զ����쳣��
			System.out.print("��ͼ����ͼ�����ʧ�ܣ�"+e.getMessage());
		}finally{
			//���ݿ�ر�
			DBUtils.closeConnection(conn);
		}	
		return v;					  
}		       
		
	/**
	 * ��ҳ����ͼ����Ϣ
	 * @param  pageNO ҳ��
	 * @param  pagesize ҳ��С
	 * @return ����Vector<BookVO>
	 */
	public Vector<BookVO> findBookBypage(int pageNO, int pagesize) {
		//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
		Connection conn = null;
		BookVO book = null;
		Vector<BookVO>  v = new Vector<BookVO>();
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			BookDao bookMrgDao= (BookDao) BookFactory.getBaseDao(conn, EnumType.BOOK_DAO);
			v = bookMrgDao.findBookBypage(pageNO, pagesize);
		} catch (Exception e) {
			//�Զ����쳣��
			System.out.print("��ҳ����ͼ��ʧ�ܣ�"+e.getMessage());
		}finally{
			//���ݿ�ر�
			DBUtils.closeConnection(conn);
		}	
		return v;					  
}		       
}
