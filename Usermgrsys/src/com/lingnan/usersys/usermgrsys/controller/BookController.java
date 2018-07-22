package com.lingnan.usersys.usermgrsys.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.lingnan.usersys.usermgrsys.business.service.BookService;
import com.lingnan.usersys.usermgrsys.business.service.BookServiceImpl;
import com.lingnan.usersys.usermgrsys.domian.BookVO;
import com.lingnan.usersys.usermgrsys.domian.UserVO;

/**
 * ͼ�������
 * @author Administrator
 *
 */
public class BookController {
	BookService bookmgrService = BookServiceImpl.getInstance();
	/**
	 * ����ͼ��id�ò���ͼ����Ϣ
	 * @param aid ͼ����
	 * @return ����ͼ�����
	 */
	public BookVO dofindBookByid(int bid){
		BookVO book =null;
		try {
		      
			book = bookmgrService.findBookByid(bid);
		} catch (Exception e) {
			System.out.print("c����ͼ��id���ҳ���:"+e.getMessage());
		}
		return book;
	}
	/**
	 * ����ͼ����Ϣ
	 * @return ����ͼ����� 
	 */
	public Vector<BookVO> dofindAllBook(){
		Vector<BookVO> v = new Vector<BookVO>(); 
		try {
			
			v = bookmgrService.findAllBook();
		} catch (Exception e) {
			System.out.print("c����ͼ��id���ҳ���:"+e.getMessage());
		}
		return v;
	}
	/**
	 * ���ͼ��
	 * @param book
	 * @return ����true����false
	 */
	public boolean doaddbook(BookVO book){
		boolean result = false;
		try {
			result = bookmgrService.addBook(book);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("c����û�����:"+e.getMessage());
		}
		return result;
	}
	/**
	 * �޸�ͼ��
	 * @param book ͼ�����
	 * @return
	 */
	public boolean doupdatbook(BookVO book){
		boolean result = false;
		try {
			result = bookmgrService.updateBook(book);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("c�޸�ͼ�����:"+e.getMessage());
		}
		return result;
	}
	
	/**
	 * ɾ��ͼ��
	 * @param bid ͼ����
	 * @return ����true����false
	 */
	public boolean dodeletebook(int bid){
		boolean result = false;
		try {
			result = bookmgrService.deleteBookByid(bid);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("cɾ��ͼ�����:"+e.getMessage());
		}
		return result;
	}
	/**
	 *  ��ͼ����ģ����ѯ
	 * @param name  ͼ����
	 * @return ����ͼ�����
	 */
	public Vector<BookVO> dofindBookByName(String name){
		Vector<BookVO>  v = new Vector<BookVO>();
		try {
		      
			v = bookmgrService.findBookByName(name);
		} catch (Exception e) {
			System.out.print("c����ͼ�������ҳ���:"+e.getMessage());
		}
		return v;
	}		
	/**
	 * ��ҳ��ѯ
	 * @param pageNO  ҳ��
	 * @param pagesize ҳ�Ĵ�С
	 * @return ����ͼ�����
	 */
public Vector<BookVO> dofindBookBypage(int pageNO,int pagesize){
	Vector<BookVO> v = new Vector<BookVO>();
	try {
	      
		v = bookmgrService.findBookBypage(pageNO, pagesize);
	} catch (Exception e) {
		System.out.print("c����ͼ�������ҳ���:"+e.getMessage());
	}
	return v;
}		
}
