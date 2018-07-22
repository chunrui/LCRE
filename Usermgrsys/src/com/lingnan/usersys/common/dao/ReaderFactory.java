package com.lingnan.usersys.common.dao;

import java.sql.Connection;

import com.lingnan.usersys.common.exception.ServiceException;
import com.lingnan.usersys.usermgrsys.business.dao.BookDaoImpl;
import com.lingnan.usersys.usermgrsys.business.dao.ReaderImpl;
/**
 * ���߹�����
 * @author Administrator
 *
 */
public class ReaderFactory {
	/**
	 * ����û�dao����Ĺ�������
	 * @param conn ���ݿ�����
	 * @param type dao����
	 * @return
	 */
 public static BaseDao getBaseDao(Connection conn,String type){
	if("reader".equals(type)){
		return new ReaderImpl(conn);
		//����ʵ��������
		//throw new ServiceException("dao������������");
	}
	//���û�к�����ָ������ƥ���ֵ������ʾ������Ϣ
	else{
		throw new ServiceException("dao������������");
	}
}
}
