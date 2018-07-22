package com.lingnan.usersys.common.dao;

import java.sql.Connection;

import com.lingnan.usersys.common.exception.ServiceException;
import com.lingnan.usersys.usermgrsys.business.dao.BookDaoImpl;
import com.lingnan.usersys.usermgrsys.business.dao.UserDaoImpl;
/**
 * ͼ�鹤����
 * @author Administrator
 *
 */
public class BookFactory {
	/**
	 * ����û�dao����Ĺ�������
	 * @param conn ���ݿ�����
	 * @param type dao����
	 * @return ���ع��� 
	 */
	public static BaseDao getBaseDao(Connection conn,String type){
		//��������dao������ͼ������book����ʵ�����û�daoʵ����
		if("book".equals(type)){
			return new BookDaoImpl(conn);
			//����ʵ��������
			//throw new ServiceException("dao������������");
		}
		//���û�к�����ָ������ƥ���ֵ������ʾ������Ϣ
		else{
			throw new ServiceException("dao������������");
		}
	}

}