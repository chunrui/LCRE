package com.lingnan.usersys.usermgrsys.domian;
/**
 * ͼ��ʵ����
 * @author Administrator
 *
 */
public class BookVO {
	
	public int Bid; //����
	public String Bname; //ͼ����
	public String Bauthor;//ͼ������
	public String Bstate; //ͼ��״̬
	public int Bflag; //ͼ���־λ
	/**
	 * ��ȡͼ����
	 * @return ����ͼ����
	 */
	public int getBid() {
		return Bid;
	}
	/**
	 * ��ͼ����
	 * @param bid ͼ���Ų���
	 */
	public void setBid(int bid) {
		Bid = bid;
	}
	/**
	 * ��ȡͼ����
	 * @return ����ͼ����
	 */
	public String getBname() {
		return Bname;
	}
	/**
	 * ��ȡͼ����
	 * @param bname ͼ��������
	 */
	public void setBname(String bname) {
		Bname = bname;
	}
	/**
	 * ��ȡ������
	 * @return ���ض���
	 */
	public String getBauthor() {
		return Bauthor;
	}
	/**
	 * ��ͼ��������
	 * @param bauthor ���߲���
	 */
	public void setBauthor(String bauthor) {
		Bauthor = bauthor;
	}
	/**
	 * ��ȡͼ��״̬
	 * @return ����״̬λ
	 */
	public String getBstate() {
		return Bstate;
	}
	/**
	 * ��ͼ��״̬
	 * @param bstate ͼ��״̬
	 */
	public void setBstate(String bstate) {
		Bstate = bstate;
	}
	/**
	 * ��ȡͼ���־λ
	 * @return ���ر�־λ
	 */
	public int getBflag() {
		return Bflag;
	}
	/**
	 * ��ͼ���־λ
	 * @param bflag ������־λ
	 */
	public void setBflag(int bflag) {
		Bflag = bflag;
	}
	 

}
