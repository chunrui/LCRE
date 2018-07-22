package com.lingnan.usersys.usermgrsys.controller;

import java.util.Vector;
import com.lingnan.usersys.usermgrsys.business.service.ReaderService;
import com.lingnan.usersys.usermgrsys.business.service.ReaderServiceImpl;
import com.lingnan.usersys.usermgrsys.domian.ReaderVO;
/**
 * ���Ʋ������
 * @author Administrator
 *
 */
public class ReaderController {
	ReaderService  readermgrService = ReaderServiceImpl.getInstance();
	/**
	 * ����ͼ��id�ò���ͼ����Ϣ
	 * @param aid ͼ��id 
	 * @return ͼ����Ϣ
	 */
	public ReaderVO dofindReaderByid(String rid){
		ReaderVO raeder =null;
		try {
		      
			raeder = readermgrService.findReaderByid(rid);
		} catch (Exception e) {
			System.out.print("c����ͼ��id���ҳ���:"+e.getMessage());
		}
		return raeder;
	}
	/**
	 * ����ͼ����Ϣ
	 * @return Vector<BookVO> 
	 */
	public Vector<ReaderVO> dofindAllReader(){
		Vector<ReaderVO> v = new Vector<ReaderVO>(); 
		try {
		      
			v = readermgrService.findAllReader();
		} catch (Exception e) {
			System.out.print("c����ͼ��id���ҳ���:"+e.getMessage());
		}
		return v;
	}
}
