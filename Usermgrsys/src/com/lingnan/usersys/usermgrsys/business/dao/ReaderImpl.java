package com.lingnan.usersys.usermgrsys.business.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.lingnan.usersys.usermgrsys.domian.BookVO;
import com.lingnan.usersys.usermgrsys.domian.ReaderVO;
import com.lingnan.usersys.usermgrsys.domian.UserVO;

/**
 * ReaderImpl��ʵ��ReaderDao������
 * @author Administrator
 *
 */
public class ReaderImpl implements ReaderDao{
	/**
	 * ���ݿ�����
	 */
   private Connection conn;
   /**
    * ���췽��
    * @param conn  ���ݿ�����
    */
   public ReaderImpl(Connection conn){
	   this.conn = conn;
   } 
   
   /**
  	 * ����id�Ų��Ҷ���
  	 * @param bid ���߱��
  	 * @return  ����ReaderVO����
  	 */
   public ReaderVO findReaderByid(String bid) {
	 //�������߱��������ڴ�Ž����
	   ReaderVO reader = null;
	    //������������������ڴ�����ݿ��ѯ�Ľ��
	   ResultSet rs = null;
	 //����Ԥ���������������������ڽ������ݿ����������
	   PreparedStatement prestmt = null;
	   try {
		   //���Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
		   prestmt =conn.prepareStatement("select * from T_reader where Sid=?");
		   //����Ԥ�����set������������ֵ
		   prestmt.setString(1,bid);
		   //ִ��Ԥ������䣬���ѵõ��Ľ�����������������
		   rs = prestmt.executeQuery();
		   //�����������ѽ���������reader������ 
		   while(rs.next()){
			   reader = new ReaderVO();
			   reader.setSid(rs.getString(1));
			   reader.setSname(rs.getString(2));
			   reader.setSage(rs.getInt(3));
			   reader.setSsex(rs.getString(4));
			   reader.setSclassid(rs.getString(5));
			   reader.setSdepartment(rs.getString(6));
			   reader.setSemail(rs.getString(7));
			   reader.setSflag(rs.getInt(8));
		   }
	} catch (Exception e) {
		// TODO: handle exception
	}
		return reader;
   }
   /**
 	 * �������ж�����Ϣ
 	 * @return  ����Vector
 	 */
   public Vector<ReaderVO> findAllReader() {
	   //�������߱��������ڴ�Ž����
	   ReaderVO reader = null;
	    //������������������ڴ�����ݿ��ѯ�Ľ��
	   ResultSet rs = null;
	 //����Ԥ���������������������ڽ������ݿ����������
	   PreparedStatement prestmt = null;
	   Vector<ReaderVO> v = new Vector<ReaderVO>();
	   try {
		   //��Ա���Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
		   prestmt =conn.prepareStatement("select * from T_reader where Sflag=1");
		   //ִ��Ԥ������䣬���ѵõ��Ľ�����������������
		   rs = prestmt.executeQuery();
		   //�����������ѽ���������reader������ 
		   while(rs.next()){
			   reader = new ReaderVO();
			   reader.setSid(rs.getString(1));
			   reader.setSname(rs.getString(2));
			   reader.setSage(rs.getInt(3));
			   reader.setSsex(rs.getString(4));
			   reader.setSclassid(rs.getString(5));
			   reader.setSdepartment(rs.getString(6));
			   reader.setSemail(rs.getString(7));
			   reader.setSflag(rs.getInt(8));
			   v.add(reader);
		   }
	} catch (Exception e) {
		// TODO: handle exception
	}
		return v;
   } 
   
   
   
/**
 * ��Ӷ�����Ϣ
 * @param reader ������Ϣ
 * @return  ����true����false
 */
public boolean addReader(ReaderVO reader) {
	// TODO Auto-generated method stub
	return false;
}
 
/**
 * ���¶�����Ϣ
 * @param reader ������Ϣ
 * @return  ����true����false
 */
public boolean updateReader(ReaderVO reader) {
	// TODO Auto-generated method stub
	return false;
}
/**
 * ɾ��������Ϣ
 * @param rid ���߱��
 * @return  ����true����false
 */

public boolean deleteReaderByid(String rid) {
	// TODO Auto-generated method stub
	return false;
}

   

}
