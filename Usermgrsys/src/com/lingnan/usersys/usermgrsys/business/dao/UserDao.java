package com.lingnan.usersys.usermgrsys.business.dao;

import java.util.Vector;

import com.lingnan.usersys.common.dao.BaseDao;
import com.lingnan.usersys.usermgrsys.domian.UserVO;
/**
 * �û�dao�ӿ�
 * @author Administrator
 *
 */
public interface UserDao extends BaseDao{
	/**
	 *�û�ע��/����û�
	 * @param user �û���Ϣ
	 * @return ����ֵΪtrue����false
	 */
	public boolean addUser(UserVO user);
	/**
	 * �û���¼
	 * @param aid �û����
	 * @param pass �û�����
	 * @return  �����û�����
	 */
	public UserVO login(String aid,String pass);
	/**
	 * �û�����
	 * @param user �û���Ϣ
	 * @return ����true����false
	 */
	public boolean updateUser(UserVO user);
	/**
	 * ����id�Ų����û�
	 * @param aid �û����
	 * @return  �����û�����
	 */
	public UserVO findUserByid(String aid);
	
	/**
	 * ���������û�
	 *@return  �����û�����
	 */
	public Vector<UserVO> findAllUser();
	/**
	 * ����aid��ɾ���û�
	 * @param aid �û����
	 * @return  true����false
	 */
	public boolean deleteUserByid(String aid);

}
