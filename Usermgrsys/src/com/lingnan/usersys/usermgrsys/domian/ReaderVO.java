package com.lingnan.usersys.usermgrsys.domian;
/**
 * ����ʵ����
 * @author Administrator
 *
 */
public class ReaderVO {
	public String Sid;   //����
	public String Sname;  //���߱��
	public String Ssex;  //���߱��
	public String Sclassid;  //���߱��
	public String Sdepartment;  //����Ժϵ
	public int Sage;  //��������
	public String Semail; //��������
	public int Sflag;  //���߱�־λ
	/**
	 * ��ȡ���߱��
	 * @return
	 */
	public String getSid() {
		return Sid;
	}
	/**
	 * ����߱��
	 * @param sid
	 */
	public void setSid(String sid) {
		Sid = sid;
	}
	/**
	 * ��ȡ��������
	 * @return
	 */
	public String getSname() {
		return Sname;
	}
	/**
	 * ���������
	 * @param sname
	 */
	public void setSname(String sname) {
		Sname = sname;
	}
	/**
	 * ��ȡ�����Ա�
	 * @return
	 */
	public String getSsex() {
		return Ssex;
	}
	/**
	 * ������Ա�
	 * @param ssex
	 */
	public void setSsex(String ssex) {
		Ssex = ssex;
	}
	/**
	 * ��ȡ���߰༶
	 * @return
	 */
	public String getSclassid() {
		return Sclassid;
	}
	/**
	 * ����߰༶
	 * @param sclassid
	 */
	public void setSclassid(String sclassid) {
		Sclassid = sclassid;
	}
	/**
	 * ��ȡ����Ժϵ
	 * @return
	 */
	public String getSdepartment() {
		return Sdepartment;
	}
	/**
	 * �����Ժϵ
	 * @param sdepartment
	 */
	public void setSdepartment(String sdepartment) {
		Sdepartment = sdepartment;
	}
	/**
	 * ��ȡ��������
	 * @return
	 */
	public String getSemail() {
		return Semail;
	}
	/**
	 * ���������
	 * @param semail
	 */
	public void setSemail(String semail) {
		Semail = semail;
	}
	
	
	
	/**
	 * ��ȡ��������
	 * @return
	 */
	public int getSage() {
		return Sage;
	}
	/**
	 * ���������
	 * @param sage
	 */
	public void setSage(int sage) {
		Sage = sage;
	}
	/**
	 * ��ȡ���߱�־λ
	 * @return
	 */
	public int getSflag() {
		return Sflag;
	}
	/**
	 * ����߱�־λ
	 * @param sflag
	 */
	public void setSflag(int sflag) {
		this.Sflag = sflag;
	}
}

