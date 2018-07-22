package com.lingnan.usersys.usermgrsys.business.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.usermgrsys.domian.UserVO;
/**
 * UserDaoImpl��ʵ��UserDao������
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao{
	/**
	 * ���ݿ�����
	 */
   private Connection conn;
   /**
    * ���췽��
    * @param conn  ���ݿ�����
    */
   public UserDaoImpl(Connection conn){
	   this.conn = conn;
   }
   /**
	 * �û���¼
	 * @param name �û���
	 * @param password ����
	 * @return �û���Ϣ
	 */
   public UserVO login(String aid, String pass) {
	   //�����û����������ڴ�Ž����
	   UserVO user = null;
	    //������������������ڴ�����ݿ��ѯ�Ľ��
	   ResultSet rs = null;
	 //����Ԥ���������������������ڽ������ݿ����������
	   PreparedStatement prestmt = null;
	   try {
		   //��Ա���Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
		   prestmt =conn.prepareStatement("select * from T_user where Tid=? and Tpassword=? and Tflag=1");
		   //����Ԥ�����set������������ֵ
		   prestmt.setString(1,aid);
		   prestmt.setString(2,pass);
		   //ִ��Ԥ������䣬���ѵõ��Ľ�����������������
		   rs = prestmt.executeQuery();
		   //�����������ѽ���������user������ 
		   while(rs.next())
		   {
			   user = new UserVO();
			   user.setAid(rs.getString(1));
			   user.setAname(rs.getString(2));
			   user.setApassword(rs.getString(3));
			   user.setPower(rs.getInt(4));
			   user.setAflag(rs.getInt(5));
		   }
	} catch (Exception e) {
		// TODO: handle exception
		System.out.print("��¼ʧ�ܣ�");
	}finally{
		 DBUtils.closeStatement(rs,prestmt);  
	   }
       return user;
	}
   

   /**
  	 * �û���ӷ���
  	 * @param user �û�����
  	 * @return ����true����false
  	 */
   public boolean addUser(UserVO user) {
	  boolean flag = false;
	 //����Ԥ���������������������ڽ������ݿ����������
	   PreparedStatement pret = null; 
	   //��¼�����������
	   int result = -1;
	  try {
		  DBUtils.beginTransaction(conn);
		//�������Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
		  // prestmt =conn.prepareStatement("update T_user set Tid='"+aid+"',Tname='"+name+"',Tpassword='"+password+"',Tpower='"+power+"'");
		  pret =conn.prepareStatement("insert into T_user(Tid,Tname,Tpassword,Tpower)"
			+ "values(?,?,?,?)");
		  pret.setString(1, user.getAid());
		  pret.setString(2, user.getAname());
		  pret.setString(3, user.getApassword());
		  pret.setInt(4, user.getPower());
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
		  System.out.print("����û�ʧ�ܣ�");
	}finally{
		DBUtils.closeStatement(null,pret); 
	}
	   return flag;
  }
   
   /**
	 * ����id�Ų����û�
	 * @param aid �û����
	 * @return  ����UserVO����
	 */
   public UserVO findUserByid(String aid){
	 //�����û����������ڴ�Ž����
	   UserVO user = null;
	    //������������������ڴ�����ݿ��ѯ�Ľ��
	   ResultSet rs = null;
	 //����Ԥ���������������������ڽ������ݿ����������
	   PreparedStatement prestmt = null;
	   try {
		   //��Ա���Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
		   prestmt =conn.prepareStatement("select * from T_user where Tid=? and Tflag=1");
		   //����Ԥ�����set������������ֵ
		   prestmt.setString(1,aid);
		   //ִ��Ԥ������䣬���ѵõ��Ľ�����������������
		   rs = prestmt.executeQuery();
		   //�����������ѽ���������user������ 
		   while(rs.next()){
			   user = new UserVO();
			   user.setAid(rs.getString(1));
			   user.setAname(rs.getString(2));
			   user.setApassword(rs.getString(3));
			   user.setPower(rs.getInt(4));
			   user.setAflag(rs.getInt(5));
		   }
	} catch (Exception e) {
		// TODO: handle exception
	}finally{
		DBUtils.closeStatement(rs,prestmt); 
	}
		return user;		
	}
   
   /**
	 * ���������û���Ϣ
	 * @retuen �����û�����
	 *
	 */
	public Vector<UserVO> findAllUser(){
		   //�����û����������ڴ�Ž����
		   UserVO user = null;
		   //������������������ڴ�����ݿ��ѯ�Ľ��
		   ResultSet rs = null;
		   //����Ԥ���������������������ڽ������ݿ����������
		   PreparedStatement prestmt = null;
		   Vector<UserVO> v = new Vector<UserVO> ();
		   try {
			   //��Ա���Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
			   prestmt =conn.prepareStatement("select * from T_user where Tflag=1");
			   //ִ��Ԥ������䣬���ѵõ��Ľ�����������������
			   rs = prestmt.executeQuery();
			   //�����������ѽ���������user������ 
			   while(rs.next()){
				   user = new UserVO();
				   user.setAid(rs.getString(1));
				   user.setAname(rs.getString(2));
				   user.setApassword(rs.getString(3));
				   user.setPower(rs.getInt(4));
				   user.setAflag(rs.getInt(5));
				   v.add(user);
			   }
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtils.closeStatement(rs,prestmt); 
		}
			return v;		
		}
	/**
	 * �޸��û���Ϣ
	 * @param user  �û�����
	 * @return ����true����false
	 */	
  public boolean updateUser(UserVO user) {
	      boolean flag = false;
		 //����Ԥ���������������������ڽ������ݿ����������
		   PreparedStatement pret = null; 
		   //��¼�����������
		   int result = -4;
//		   String aid= user.getAid();
//		   String name = user.getAname();
//		   String password = user.getApassword();
//		   int power = user.getPower();
		  try {
			//�������Ӷ����Ԥ���뷽�����õ�Ԥ����Ľ�����󣬸�ֵ��Ԥ�������
			  DBUtils.beginTransaction(conn);
			 pret =conn.prepareStatement("update T_user set Tid=?,Tname=?,Tpassword=?,Tpower=? where Tid=?");
			  pret.setString(1, user.getAid());
			  pret.setString(2, user.getAname());
			  pret.setString(3, user.getApassword());
			  pret.setInt(4, user.getPower());
			  pret.setString(5, user.getAid());
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
			  System.out.print("�޸��û�ʧ�ܣ�"+e.getMessage());
		}finally{
			DBUtils.closeStatement(null,pret); 
		}
		   return flag;
		   
  }
/**
 * ɾ������
 * @param aid  �û����
 * @return ����true����false
 */
 public boolean deleteUserByid(String aid) {
	boolean flag=false;
	PreparedStatement pstam=null;
	try {
		DBUtils.beginTransaction(conn);
		pstam = conn.prepareStatement("delete from T_user where Tid='"+aid+"'");
		int result = pstam.executeUpdate();
		DBUtils.commit(conn);
		if (result>0) {
			flag=true;
		}else{
			flag=false;
		}
	}catch (SQLException e) {
		DBUtils.rollback(conn);
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.print("ɾ���û���Ϣʧ�ܣ�");
	}finally{
		DBUtils.closeStatement(null,pstam); 
	}		
	return flag;
}  
}
