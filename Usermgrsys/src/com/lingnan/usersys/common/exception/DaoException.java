package com.lingnan.usersys.common.exception;
/**
 * Dao�쳣��
 * @author Administrator
 *
 */
public class DaoException extends RuntimeException{
	/**
	 * Ĭ�ϵĹ��췽��
	 */
	public DaoException(){
		
	}
	/**
	 * ���췽��
	 * �����쳣����ϸ��Ϣ
	 * @param arg0  �������
	 */
	public DaoException(String arg0){
		super(arg0);
	}
	/**
	 * ���췽��
	 * ���������쳣��ԭ��
	 * @param arg1    �������
	 */
	public DaoException(Throwable arg1){
		super(arg1);
	}
	
	/**
	 * ���췽��
	 * ���������쳣����ϸ��Ϣ��ԭ��
	 * @param arg0    �������
	 * @param arg1    �������
	 */
	public DaoException(String arg0,Throwable arg1){
		super(arg0,arg1);
	}
	
}
