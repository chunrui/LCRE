package com.lingnan.usersys.usermgrsys.business.dao;
import java.util.Vector;

import com.lingnan.usersys.common.dao.BaseDao;
import com.lingnan.usersys.usermgrsys.domian.BookVO;
/**
 * ͼ��dao�ӿ�
 * @author Administrator
 *
 */
public interface BookDao extends BaseDao{
	/**
	 * ���ͼ�鷽��
	 * @param book ͼ����Ϣ
	 * @return ����ֵΪtrue����false
	 */
	public boolean addBook(BookVO book);
	/**
	 * ͼ�����
	 * @param book ͼ����Ϣ
	 * @return ����true����false
	 */
	public boolean updateBook(BookVO book);
	/**
	 * ����id�Ų���ͼ��
	 * @param bid ͼ����
	 * @return  ����ͼ�����
	 */
	public BookVO findBookByid(int bid);
	
	/**
	 * ��������ͼ��
	 *
	 */
	public Vector<BookVO> findAllBook();
	/**
	 * ����bid��ɾ��ͼ��
	 * @param bid ͼ����
	 * @return  true����false
	 */
	public boolean deleteBookByid(int bid);
  /**
   * ͨ��ͼ������ѯ
   * @param name  ͼ����
   * @return  ����ͼ�����
   */
	public Vector<BookVO> findBookByName(String name);
	/**
	 * ��ҳ��ѯ
	 * @param pageNO  ҳ��
	 * @param pagesize  ҳ�Ĵ�С
	 * @return ����ͼ�����
	 */
	public Vector<BookVO> findBookBypage(int pageNO,int pagesize);
}
