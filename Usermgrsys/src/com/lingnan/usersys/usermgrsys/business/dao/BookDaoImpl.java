package com.lingnan.usersys.usermgrsys.business.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.usermgrsys.domian.BookVO;
import com.lingnan.usersys.usermgrsys.domian.UserVO;

/**
 * BookDaoImpl��ʵ��ookDao������
 * @author Administrator
 *
 */
public class BookDaoImpl implements BookDao {
	/**
	 * ���ݿ�����
	 */
   private Connection conn;
   /**
    * ���췽��
    * @param conn  ���ݿ�����
    */
   public BookDaoImpl(Connection conn){
	   this.conn = conn;
   } 
   
   /**
  	 * ����id�Ų���ͼ��
  	 * @param bid ͼ����
  	 * @return  ����BookVO����
  	 */
   public BookVO findBookByid(int bid) {
	 //�����û����������ڴ�Ž����
	   BookVO book = null;
	    //������������������ڴ�����ݿ��ѯ�Ľ��
	   ResultSet rs = null;
	 //����Ԥ���������������������ڽ������ݿ����������
	   PreparedStatement prestmt = null;
	   try {
		   //��Ա���Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
		   prestmt =conn.prepareStatement("select * from book where Bid=? and Bflag=1");
		   //����Ԥ�����set������������ֵ
		   prestmt.setInt(1,bid);
		   //ִ��Ԥ������䣬���ѵõ��Ľ�����������������
		   rs = prestmt.executeQuery();
		   //�����������ѽ���������book������ 
		   while(rs.next()){
			   book = new BookVO();
			   book.setBid(rs.getInt(1));
			   book.setBname(rs.getString(2));
			   book.setBauthor(rs.getString(3));
			   book.setBstate(rs.getString(4));
			   book.setBflag(rs.getInt(5));
		   }
	} catch (Exception e) {
		// TODO: handle exception
	}finally{
		DBUtils.closeStatement(rs,prestmt); 
	}
		return book;
   }
   
   

   
   /**
 	 * ��������ͼ����Ϣ
 	 * @return  ����Vector
 	 */
   public Vector<BookVO> findAllBook() {
	   //����ͼ����������ڴ�Ž����
	   BookVO book = null;
	    //������������������ڴ�����ݿ��ѯ�Ľ��
	   ResultSet rs = null;
	 //����Ԥ���������������������ڽ������ݿ����������
	   PreparedStatement prestmt = null;
	   Vector<BookVO> v = new Vector<BookVO>();
	   try {
		   //��Ա���Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
		   prestmt =conn.prepareStatement("select * from book");
		   //ִ��Ԥ������䣬���ѵõ��Ľ�����������������
		   rs = prestmt.executeQuery();
		   //�����������ѽ���������book������ 
		   while(rs.next()){
			   book = new BookVO();
			   book.setBid(rs.getInt(1));
			   book.setBname(rs.getString(2));
			   book.setBauthor(rs.getString(3));
			   book.setBstate(rs.getString(4));
			   book.setBflag(rs.getInt(5));
			   v.add(book);
		   }
	} catch (Exception e) {
		// TODO: handle exception
	}finally{
		DBUtils.closeStatement(rs,prestmt); 
	}
		return v;
   } 
   
   
   /**
 	 * ���ͼ��
 	 * @param book ͼ�����
 	 * @return  ����true����false
 	 */
public boolean addBook(BookVO book) {
	 boolean flag = false;
	 //����Ԥ���������������������ڽ������ݿ����������
	   PreparedStatement pret = null; 
	   //��¼�����������
	   int result = -1;
	  try {
		  DBUtils.beginTransaction(conn);
		//�������Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
		  // prestmt =conn.prepareStatement("update T_user set Tid='"+aid+"',Tname='"+name+"',Tpassword='"+password+"',Tpower='"+power+"'");
		  pret =conn.prepareStatement("insert into book(Bname,Bauthor,Bstate)"
			+ "values(?,?,?)");
		  //pret.setInt(1, book.getBid());
		  pret.setString(1, book.getBname());
		  pret.setString(2, book.getBauthor());
		  pret.setString(3, book.getBstate());
		  result = pret.executeUpdate();
		  DBUtils.commit(conn);
		  if(result>0){
			  flag = true;  
		  }else{
			  flag = false;
		  }	  
	  } catch (Exception e) {
		// TODO: handle exception
		  DBUtils.rollback(conn);
		  System.out.print("���ͼ��ʧ�ܣ�");
	}finally{
		DBUtils.closeStatement(null,pret); 
	}
	   return flag;
}
   /**
	 * ����ͼ��
	 * @param book ͼ�����
	 * @return  ����true����false
	 */
public boolean updateBook(BookVO book) {
	 boolean flag = false;
	 //����Ԥ���������������������ڽ������ݿ����������
	   PreparedStatement pret = null; 
	   //��¼�����������
	   int result = -4;
	  try {
		//�������Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
		  DBUtils.beginTransaction(conn);
		  pret =conn.prepareStatement("update book set Bid=?,Bname=?,Bauthor=?,Bstate=? where Bid=?");
		  pret.setInt(1, book.getBid());
		  pret.setString(2, book.getBname());
		  pret.setString(3, book.getBauthor());
		  pret.setString(4, book.getBstate());
		  pret.setInt(5, book.getBid());
		  result = pret.executeUpdate();
		  DBUtils.commit(conn);
		  System.out.print("----"+result);
		  if(result>0){
			  flag = true;
		  }else{
			  flag = false;
		  }
		  
		  	  
	  } catch (Exception e) {
		// TODO: handle exception
		  DBUtils.rollback(conn);
		  System.out.print("�޸�ͼ��ʧ�ܣ�"+e.getMessage());
	}finally{
		DBUtils.closeStatement(null,pret); 
	}
	   return flag;   
}


     /**
        * ����ͼ��
	    * @param bid ͼ��id
	    * @return  ����true����false 
      */
public boolean deleteBookByid(int bid) {
	boolean flag=false;
	PreparedStatement pstam=null;
	try {
		DBUtils.beginTransaction(conn);
		pstam = conn.prepareStatement("delete from book where Bid="+bid+"");
		int result = pstam.executeUpdate();
		DBUtils.commit(conn);
		if(result>0)
		{
		    flag=true;
		}else {
			flag=false;
		}
		
	}catch (SQLException e) {
		DBUtils.rollback(conn);
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.print("ɾ��ͼ��ʧ�ܣ�"+e.getMessage());
	}finally{
		DBUtils.closeStatement(null,pstam); 
	}		
	return flag;
}

/**
 * ͨ��ͼ����ģ����ѯͼ����Ϣ
 * @param name ͼ����
 * @return  ����ͼ�����
 */
public Vector<BookVO> findBookByName(String name) {
	//�����û����������ڴ�Ž����
	   BookVO book = null;
	    //������������������ڴ�����ݿ��ѯ�Ľ��
	   ResultSet rs = null;
	 //����Ԥ���������������������ڽ������ݿ����������
	   PreparedStatement prestmt = null;
	   Vector<BookVO>  v = new Vector<BookVO>();
	   try {
		   //�������Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
		   prestmt =conn.prepareStatement
				   ("select * from book where Bname like ? and Bflag=1");
		   //����Ԥ�����set������������ֵ
		  prestmt.setString(1,"%" + name + "%");
		   //ִ��Ԥ������䣬���ѵõ��Ľ�����������������
		   rs = prestmt.executeQuery();
		   //�����������ѽ���������book������ 
		   while(rs.next()){
			   book = new BookVO();
			   book.setBid(rs.getInt(1));
			   book.setBname(rs.getString(2));
			   book.setBauthor(rs.getString(3));
			   book.setBstate(rs.getString(4));
			   book.setBflag(rs.getInt(5));
			   v.add(book);
		   }
	} catch (Exception e) {
		// TODO: handle exception
	}finally{
		DBUtils.closeStatement(rs,prestmt); 
	}
		return v;
}

/**
 * ��ҳ��ѯͼ����Ϣ
 * @param pageNo ҳ��
 * @param pagesize ҳ���С
 * @return  ����ͼ�����
 */
public Vector<BookVO> findBookBypage(int pageNo,int pagesize) {
	//�����û����������ڴ�Ž����
	   BookVO book = null;
	    //������������������ڴ�����ݿ��ѯ�Ľ��
	   ResultSet rs = null;
	 //����Ԥ���������������������ڽ������ݿ����������
	   PreparedStatement prestmt = null;
	   Vector<BookVO>  v = new Vector<BookVO>();
	   try {
		   //��Ա���Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
		   prestmt =conn.prepareStatement
				   ("select * from (select t2.*,rownum rn from "
				   		+ "(select t1.* from book t1 order by Bid) t2) where rn>? and rn<=?");
		   //����Ԥ�����set������������ֵ
		   prestmt.setInt(1, (pageNo-1)*pagesize);
		   prestmt.setInt(2, pageNo*pagesize);
		   rs  = prestmt.executeQuery();
		   while(rs.next()){
			   book = new BookVO();
			   book.setBid(rs.getInt(1));
			   book.setBname(rs.getString(2));
			   book.setBauthor(rs.getString(3));
			   book.setBstate(rs.getString(4));
			   book.setBflag(rs.getInt(5));
			   v.add(book);
		   }
	   }
		   catch (Exception e) {
				// TODO: handle exception
			}finally{
				DBUtils.closeStatement(rs,prestmt); 
			}
	   return v;
}  

}
