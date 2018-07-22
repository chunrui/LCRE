package com.lingnan.usersys.usermgrsys.business.service;
import java.sql.Connection;
import java.util.Vector;

import javax.naming.spi.DirStateFactory.Result;

import com.lingnan.usersys.common.constant.EnumType;
import com.lingnan.usersys.common.dao.DaoFactory;
import com.lingnan.usersys.common.exception.DaoException;
import com.lingnan.usersys.common.exception.ServiceException;
import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.usermgrsys.business.dao.UserDao;
import com.lingnan.usersys.usermgrsys.domian.UserVO;

public class UserServiceImpl implements UserService{
	/**
	 * ����һ��userservice
	 */
	private static UserService userservice = new UserServiceImpl();
	/**
	 * ˽�еĹ��췽��
	 */
	private UserServiceImpl(){
		
	}
	/**
	 * ͨ��getInstance()��ȡUserService
	 * @return
	 */
	public static UserService getInstance()
	{
		return userservice;
	}

	/**
	 * ����û���Ϣ
	 * @param user �û�����
	 * @return ����true����false
	 */
	public boolean addUser(UserVO user) {
		// TODO Auto-generated method stub
		Connection conn = null;
		//UserVO user = null;
		//�������������ڼ�¼��ӽ������ֵ
		boolean result =false;
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			UserDao userMrgDao= (UserDao) DaoFactory.getBaseDao(conn, EnumType.USER_DAO);
			//��������
			DBUtils.beginTransaction(conn);
			//user.setPower(2);
			//����dao��adduser�����������������ݿ��������������������result����
			result = userMrgDao.addUser(user);
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
	 * �û���¼
	 * @param name �û���
	 * @param password ����
	 * @return �û���Ϣ
	 */
	public UserVO login(String aid, String pass) {
		//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
		Connection conn = null;
		UserVO user = null;
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			UserDao userMrgDao= (UserDao) DaoFactory.getBaseDao(conn, EnumType.USER_DAO);
			user = userMrgDao.login(aid, pass);
		}catch (DaoException e) {
			throw e;
		}catch (Exception e) {
			//�Զ����쳣��
			throw new ServiceException("�û���¼ʧ��@");
		}
		finally{
			//���ݿ�ر�
			DBUtils.closeConnection(conn);
		}	
		return user;
	}
	/**
	 * �޸��û���Ϣ
	 * @param user �û�����
	 * @return ����true����false
	 */
	public boolean updateUser(UserVO user) {
		// TODO Auto-generated method stub
		Connection conn = null;
		//UserVO user = null;
		//�������������ڼ�¼��ӽ������ֵ
		boolean result =false;
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			UserDao userMrgDao= (UserDao) DaoFactory.getBaseDao(conn, EnumType.USER_DAO);
			//��������
			DBUtils.beginTransaction(conn);
			//user.setPower(2);
			//����dao��adduser�����������������ݿ��������������������result����
			result = userMrgDao.updateUser(user);
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
	 * ����id�����û���Ϣ
	 * @param aid �û����
	 * @return ����true����false
	 */
	public UserVO findUserByid(String aid) {
		//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
		Connection conn = null;
		UserVO user = null;
		try {
			//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
			conn = DBUtils.getConnection();
			//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
			UserDao userMrgDao= (UserDao) DaoFactory.getBaseDao(conn, EnumType.USER_DAO);
			user = userMrgDao.findUserByid(aid);
		} catch (DaoException e) {
			throw e;
		}catch (Exception e) {
			//�Զ����쳣��
			throw new ServiceException("�û�����ʧ�ܡ�����");
		}finally{
			//���ݿ�ر�
			DBUtils.closeConnection(conn);
		}	
		return user;
	}		       
	/**
	 * ���������û���Ϣ
	 * @return Vector��
	 */
	public Vector<UserVO> findAllUser() {
		//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
				Connection conn = null;
				UserVO user = null;
				Vector<UserVO> v = null;
				try {
					//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
					conn = DBUtils.getConnection();
					//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
					UserDao userMrgDao= (UserDao) DaoFactory.getBaseDao(conn, EnumType.USER_DAO);
					v = userMrgDao.findAllUser();
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
	 * ����idɾ���û���Ϣ
	 * @param aid �û����
	 * @return ����true����false
	 */
	public boolean deleteUserByid(String aid) {
		      // TODO Auto-generated method stub
				Connection conn = null;
				//UserVO user = null;
				//�������������ڼ�¼��ӽ������ֵ
				boolean result =false;
				try {
					//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
					conn = DBUtils.getConnection();
					//����dao������getdao������ȡ��ָ�����͵�dao�࣬����ֵ����dao�ӿڱ���
					UserDao userMrgDao= (UserDao) DaoFactory.getBaseDao(conn, EnumType.USER_DAO);
					//��������
					DBUtils.beginTransaction(conn);
					
					//����dao��adduser�����������������ݿ��������������������result����
					result = userMrgDao.deleteUserByid(aid);
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
}
