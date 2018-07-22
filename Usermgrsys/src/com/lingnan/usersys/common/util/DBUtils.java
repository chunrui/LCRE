package com.lingnan.usersys.common.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lingnan.usersys.common.exception.DaoException;
/**
 * ���ݿ⹤����
 * @author Administrator
 *
 */
public class DBUtils {
	/**
	 * ��ȡ���ݿ�����
	 * @return ��������
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try {
			//��������
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String user = "scott";
			String password = "123456";
			//��ȡ���ݿ����Ӷ���
			conn = DriverManager.getConnection(url,user,password);
	} catch (SQLException e) {
         //�Զ����쳣��
		throw new DaoException("���ݿ�����ʧ��....",e);
	} catch (ClassNotFoundException e) {
        //�Զ����쳣��
		throw new DaoException("��������ʧ��...",e);
	}
		return conn;
	}
	
	/**
	 * ���ݿ�ر�
	 * @param conn ��������
	 */
	public static void closeConnection(Connection conn){
		try {
			if(conn!=null)
			{
				conn.close();
				conn =null;
			}
		} catch (SQLException e) {
			//�Զ����쳣��
			throw new DaoException("�ر����Ӷ���ʧ��...",e);
		}
	}
	
	
	/**
	 * �ر�statement
	 * @param rs  ��������� 
	 * @param stmt  ����
	 */
	public  static void closeStatement(ResultSet rs,Statement stmt){
		try {
			
			if(rs != null)
			{
				rs.close();
				rs = null;
			}
			if(stmt != null)
			{
				stmt.close();
				stmt = null;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			//�Զ����װ�쳣��
			throw new DaoException("�ر���������ʧ��...",e);
		}
	}
	
	/**
	 * ����ع�
	 * @param conn ���Ӳ���
	 */
	 public static void rollback(Connection conn){
		 try {
			conn.rollback();
		} catch (Exception e) {
			//�Զ����쳣��
			throw new DaoException("����ع�ʧ��...",e);
		}
	 }
	 
	 /**
		 * �ύ����
		 * @param conn ���Ӳ���
		 */
  public static void commit(Connection conn){
			 try {
				conn.commit();
			} catch (SQLException e) {
				//�Զ����쳣��
				throw new DaoException("�����ύʧ��...",e);
			}
		 }
  
  /**
   * ��������
   * @param conn ���Ӳ���
   */
  public static void beginTransaction(Connection conn){
	  try {
		conn.setAutoCommit(false);
	} catch (SQLException e) {
		//�Զ����쳣��
		throw new DaoException("���￪��ʧ��...",e);
	}
  }
  
}
