package com.lingnan.usersys.common.exception;
/**
 * Date�쳣��
 * @author Administrator
 *
 */
public class DateException extends RuntimeException{
		/**
		 * Ĭ�ϵĹ��췽��
		 */
        public DateException(){
			
		}
		/**
		 * ���췽��
		 * �����쳣����ϸ��Ϣ
		 * @param arg0   �������
		 */
		public DateException(String arg0){
			super(arg0);
		}
		/**
		 * ���췽��
		 * ���������쳣��ԭ��
		 * @param arg1    �������
		 */
		public DateException(Throwable arg1){
			super(arg1);
		}
		
		/**
		 * ���췽��
		 * ���������쳣����ϸ��Ϣ��ԭ��
		 * @param arg0    �������
		 * @param arg1    �������
		 */
		public DateException(String arg0,Throwable arg1){
			super(arg0,arg1);
		}

}
