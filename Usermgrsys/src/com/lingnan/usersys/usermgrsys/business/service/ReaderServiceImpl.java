package com.lingnan.usersys.usermgrsys.business.service;

import java.sql.Connection;
import java.util.Vector;

import com.lingnan.usersys.common.constant.EnumType;
import com.lingnan.usersys.common.dao.DaoFactory;
import com.lingnan.usersys.common.dao.ReaderFactory;
import com.lingnan.usersys.common.exception.DaoException;
import com.lingnan.usersys.common.exception.ServiceException;
import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.usermgrsys.business.dao.ReaderDao;
import com.lingnan.usersys.usermgrsys.business.dao.UserDao;
import com.lingnan.usersys.usermgrsys.domian.ReaderVO;
import com.lingnan.usersys.usermgrsys.domian.UserVO;
/**
 * ����service��
 * @author Administrator
 *
 */
public class ReaderServiceImpl implements ReaderService{
	/**
	 * ����һ��readerService
	 */
	private static ReaderService readerService = new ReaderServiceImpl();
	/**
	 * ˽�еĹ��췽��
	 */
	private ReaderServiceImpl(){
		
	}
	/**
	 * ͨ��getInstance()��ȡUserService
	 * @return
	 */
	public static ReaderService getInstance()
	{
		return readerService; 
	}
	/**
	 * ��Ӷ�����Ϣ
	 * @param reader ���߶���
	 * @return ����true����false 
	 */
	public boolean addReader(ReaderVO reader) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * ���¶�����Ϣ
	 * @param reader ���߶���
	 * @return ����true����false 
	 */
	public boolean updateReader(ReaderVO reader) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * ����id�Ų��Ҷ�����Ϣ
	 * @param rid ���߱��
	 * @return ���ض��߶���
	 */
	public ReaderVO findReaderByid(String rid) {
		 //�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
		Connection conn = null;
		ReaderVO reader = null;
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			ReaderDao readerMrgDao= (ReaderDao) ReaderFactory.getBaseDao(conn, EnumType.Read_DAO);
			reader = readerMrgDao.findReaderByid(rid);
		} catch (DaoException e) {
			throw e;
		}catch (Exception e) {
			//�Զ����쳣��
			throw new ServiceException("�û�����ʧ�ܡ�����");
		}finally{
			//���ݿ�ر�
			DBUtils.closeConnection(conn);
		}	
		return reader;
	}			      	

	/**
	 * ���Ҷ���������Ϣ
	 * @return ���ض��߶���
	 */
	public Vector<ReaderVO> findAllReader() {
		 //�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
		Connection conn = null;
		Vector<ReaderVO> v = null;
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			ReaderDao readerMrgDao= (ReaderDao) ReaderFactory.getBaseDao(conn, EnumType.Read_DAO);
			v = readerMrgDao.findAllReader();
		} catch (DaoException e) {
			throw e;
		}catch (Exception e) {
			//�Զ����쳣��
			throw new ServiceException("�û�����ʧ�ܡ�����");
		}finally{
			//���ݿ�ر�
			DBUtils.closeConnection(conn);
		}	
		return v;
	}			      	
	/**
	 * ����id��ɾ��������Ϣ
	 * @param rid ���߱��
	 * @return ����true����false
	 */
	public boolean deleteReaderByid(String rid) {
		// TODO Auto-generated method stub
		return false;
	}

}
