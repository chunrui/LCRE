package com.lingnan.usersys.usermgrsys.view;

import com.lingnan.usersys.usermgrsys.domian.UserVO;

/**
 * ��ͼ�Ľӿ�
 * @author Administrator
 *
 */
public interface BaseFrame {
	/**
	 * ��ʾҳ��
	 */
	public void show();
	/**
	 * ����ҳ��
	 */
	public void searchshow();
	/**
	 * ����û���ʾ
	 * @param type ���� 
	 */
	public void addshow(String type);
	/**
	 * ������Ϣ
	 * @param type ����
	 * @param user �û�����
	 */
	public void updateshow(String type,UserVO user);
}
