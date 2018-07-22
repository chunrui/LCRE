package com.lingnan.usersys.usermgrsys.business.service;

import java.util.List;
import java.util.Vector;

import com.lingnan.usersys.usermgrsys.domian.BookVO;
/**
 * BookService������
 * @author Administrator
 *
 */
public interface BookService {
	/**
	 *���ͼ��
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
	 * @return  ����BookVO����
	 */
	public BookVO findBookByid(int bid);
	
	/**
	 * ��������ͼ��
	 * @return  ����BookVO����
	 */
	public Vector<BookVO> findAllBook();
	/**
	 * ����bid��ɾ��ͼ��
	 * @param bid ͼ����
	 * @return  ����true����false
	 */
	public boolean deleteBookByid(int bid);
	/**
	   * ͨ��ͼ������ѯ
	   * @param name  ͼ����
	   * @return ����ͼ�����
	   */
	public Vector<BookVO> findBookByName(String name);
		/**
		 * ��ҳ��ѯ
		 * @param page  ҳ��
		 * @param size  ҳ�Ĵ�С
		 * @return  ����ͼ�����
		 */
	public Vector<BookVO> findBookBypage(int pageNO,int pagesize);

}