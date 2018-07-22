package com.lingnan.usersys.usermgrsys.controller;

import java.util.Vector;

import com.lingnan.usersys.usermgrsys.business.service.UserService;
import com.lingnan.usersys.usermgrsys.business.service.UserServiceImpl;
import com.lingnan.usersys.usermgrsys.domian.UserVO;
/**
 * �û�������
 * @author Administrator
 *
 */
public class UserController {
	/**
	 * ͨ��UserServiceImpl��getInstance()������ȡusermgrService����
	 */
	UserService usermgrService = UserServiceImpl.getInstance();
	/**
	 * ��¼����
	 * @param aid �û�id
	 * @param pass �û�����
	 * @return  �����û���Ϣ
	 */
	public UserVO dologin(String aid,String pass)
	{ 
		//����һ���û�ʵ�壬���ڴ�ŵ�¼�û�����Ϣ
		UserVO user =null; 
		try{
			//����UserServiceImpl��login��������
		    user = usermgrService.login(aid, pass);
	}catch(Exception e){
		//����쳣��Ϣ
		System.out.print("��¼���ִ��󣡣�"+e.getMessage());
	}
		//�����û���Ϣ
		return user;
	}
	/**
	 * �����û�id�ò����û���Ϣ
	 * @param aid �û�id 
	 * @return �û���Ϣ
	 */
	public UserVO dofindUserByid(String aid){
		UserVO user =null;
		try {
			usermgrService.findUserByid(aid);
		} catch (Exception e) {
			System.out.print("c�����û�id���ҳ���:"+e.getMessage());
		}
		return user;
	}
	
	/**
	 * �����û�id�ò����û���Ϣ
	 * @param aid �û�id 
	 * @return �û���Ϣ
	 */
	public Vector<UserVO> dofindAllUser(){
		Vector<UserVO>  v = null;
		try {
			v = usermgrService.findAllUser();
		} catch (Exception e) {
			System.out.print("c�����û�id���ҳ���:"+e.getMessage());
		}
		return v;
	}
	
	/**
	 * ����û�/ע��
	 * @param user
	 * @return
	 */
	public boolean doadduser(UserVO user){
		boolean result = false;
		try {
			result = usermgrService.addUser(user);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("c����û�����:"+e.getMessage());
		}
		return result;
	}
	/**
	 * �޸��û���Ϣ
	 * @param user �û�����
	 * @return ����true����false
	 */
	public boolean doupdateuser(UserVO user){
		boolean result = false;
		try {
			result = usermgrService.updateUser(user);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("c�޸��û�����:"+e.getMessage());
		}
		return result;
	}
	
	/**
	 * ɾ���û���Ϣ
	 * @param aid ���߱��
	 * @return ����true����false
	 */
	public boolean dodeleteuser(String aid){
		boolean result = false;
		try {
			result = usermgrService.deleteUserByid(aid);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("c�޸��û�����:"+e.getMessage());
		}
		return result;
	}
}
