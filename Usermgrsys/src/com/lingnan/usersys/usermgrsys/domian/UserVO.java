package com.lingnan.usersys.usermgrsys.domian;
/**
 * �û�ʵ����
 * @author Administrator
 *
 */
public class UserVO {
		public String aid; //����
		public String aname; //�û�����
		public String apassword; //�û�����
		public int aflag; //�û���־λ
		public int power; //�û�Ȩ��
		/**
		 * ��ȡ�û�id����
		 * @return �����û�id��
		 */
		public String getAid() {
			return aid;
		}
		/**
		 * �����û�id��
		 * @param aid �û�id��
		 */
		public void setAid(String aid) {
			this.aid = aid;
		}
		/**
		 * ��ȡ�û���
		 * @return �����û���
		 */
		public String getAname() {
			return aname;
		}
		/**
		 * ���û���
		 * @param aname �û����Ʋ���
		 */
		public void setAname(String aname) {
			this.aname = aname;
		}
		/**
		 * ��ȡ����
		 * @return �����û�����
		 */
		public String getApassword() {
			return apassword;
		}
		/**
		 * ������
		 * @param apassword �û��������
		 */
		public void setApassword(String apassword) {
			this.apassword = apassword;
		}
		/**
		 * ��ȡ��־λ
		 * @return �����û���־λ
		 */
		public int getAflag() {
			return aflag;
		}
		/**
		 * ���־λ
		 * @param aflag �û���־λ
		 */
		public void setAflag(int aflag) {
			this.aflag = aflag;
		}
		/**
		 * ��ȡȨ��
		 * @return �����û�Ȩ��
		 */
		public int getPower() {
			return power;
		}
		/**
		 * ��Ȩ��
		 * @param power  �û�Ȩ��
		 */
		public void setPower(int power) {
			this.power = power;
		}
		
	}
