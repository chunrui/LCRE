package com.lingnan.usersys.common.exception;
/**
 * Service�쳣��
 * @author Administrator
 *
 */
public class ServiceException extends RuntimeException{
		/**
		 * Ĭ�ϵĹ��췽��
		 */
        public ServiceException(){
			
		}
		/**
		 * ���췽��
		 * �����쳣����ϸ��Ϣ
		 * @param arg0   �������
		 */
		public ServiceException(String arg0){
			super(arg0);
		}
		/**
		 * ���췽��
		 * ���������쳣��ԭ��
		 * @param arg1    �������
		 */
		public ServiceException(Throwable arg1){
			super(arg1);
		}
		
		/**
		 * ���췽��
		 * ���������쳣����ϸ��Ϣ��ԭ��
		 * @param arg0   �������
		 * @param arg1    �������
		 */
		public ServiceException(String arg0,Throwable arg1){
			super(arg0,arg1);
		}

}
