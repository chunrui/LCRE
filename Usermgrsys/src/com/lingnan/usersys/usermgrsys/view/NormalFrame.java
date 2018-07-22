package com.lingnan.usersys.usermgrsys.view;

import java.awt.print.Book;
import java.util.Scanner;
import java.util.Vector;

import com.lingnan.usersys.usermgrsys.controller.BookController;
import com.lingnan.usersys.usermgrsys.controller.UserController;
import com.lingnan.usersys.usermgrsys.domian.BookVO;
import com.lingnan.usersys.usermgrsys.domian.UserVO;
/**
 * ��ͨ�û���ͼ
 * @author Administrator
 *
 */
public class NormalFrame extends IndexFrame{
	//�û�����
	UserVO user = null;
	BookVO book=null;
	/**
	 * �������Ĺ����������ڳ�ʼ��user����
	 * @param user �û���Ϣ
	 */
	public  NormalFrame(UserVO user){
		this.user=user;
		//System.out.println(user);
		
	}
	/**
	 * �������Ĺ����������ڳ�ʼ��book����
	 * @param book ͼ����Ϣ
	 */
	public  NormalFrame(BookVO book){
		this.book=book;
		//System.out.println(user);
		
	}
	 /**
	  * ��ͨ�û�չʾ�ķ�ʽ
	  */
	public void show(){
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("             --��ӭ������ͨ�û�����--           ");
			System.out.println("*-***************************************-*"); 
			System.out.println("*             1.�޸ĸ�����Ϣ                                                      *");       
			System.out.println("*             2.�鿴������Ϣ                                                      *");
			System.out.println("*             3.�鿴ͼ����Ϣ                                                      *");
			System.out.println("*             4.�˳�ϵͳ                                                              *");
			System.out.println("*-***************************************-*");
			int i =-1 ;
			System.out.println("������1~4�����֣�");
			while(true){
				try {
					 i = input.nextInt();
					 break;
				} catch (Exception e) {
					System.out.println("ֻ������1~4������");
					System.out.println("����������...");
				}
			}
			switch (i) {
			case 1:
				this.updateshow("�޸�", user);;
				break;
			case 2:
				this.searchshow(user);
				break;
			case 3:
			{
				while(true){ 
				System.out.println("             --��ӭ����ͼ����Ϣ��ѯģ��--         ");
				System.out.println("*-**************************************-*"); 
	    		System.out.println("*               1. ��������ѯͼ����Ϣ                              *");    
	    		System.out.println("*               2. ��id��ѯͼ����Ϣ                                *"); 
	    		System.out.println("*               3. ����                                                          *");
	    		System.out.println("*-**************************************-*"); 
	    		System.out.println("������1����2����3");
	    		int b1=input.nextInt();	
	    		switch(b1)          
    	    	{                  
    	    	case 1:
    	    		this.searchAllBookshow();break;
    	    	case 2:
    	    		this.searchBookshow();break; 
				case 3:
		    		this.show();break;
    	    	}
    	    	}
			
			}
			case 4:
				System.out.println("���˳�ϵͳ��лл����ʹ�ã�");
				System.exit(0);
			default:
				System.out.println("����������ݲ��������������룡");
			}
		}
	}
	/**
	 * ������ʾ����
	 * @param user �û�������Ϣ
	 */
	public void searchshow(UserVO user) {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);
		try {
			String power1 ="��ͨ�û�";
			System.out.println("           --��ӭ���������Ϣ��ѯ����--");
			System.out.println("-------------------------------------------");
			System.out.println("���             �ǳ�               ����                       Ȩ��");
			System.out.println(""+user.getAid()+"    "+user.getAname()+"          "+user.getApassword()+"     "+power1+"");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("������Ϣ����ʧ�ܣ�"+e.getMessage());
		}
		
		
	}
	/**
	 * ������ʾ���� 
	 * @param type ��������
	 * @param user �û�������Ϣ
	 */
	public void updateshow(String type, UserVO user) {
		Scanner input = new Scanner(System.in);
		if("�޸�".equals(type)){
			System.out.println("               --��ӭ���������Ϣ�޸ý���--");
			System.out.println("-------------------------------------------");
		}else{
				System.out.println("           --��ӭ�����û���Ϣ�޸Ľ���--");
				System.out.println("-------------------------------------------");
			}
			System.out.println("��������Ҫ�޸ĵ��˺ţ�");
			try {
				user.setAid(input.next());
				System.out.println("��������Ҫ�޸ĵ����룺");
				user.setApassword(input.next());
				System.out.println("��������Ҫ�޸ĵ��ǳƣ�");
				user.setAname(input.next());
				UserController uc = new UserController();
				user.setPower(2);
				String power = "��ͨ�û�";
				System.out.println(""+user.getAid()+"    "+user.getAname()+"          "+user.getApassword()+"     "+power+"");
				boolean binsert = uc.doupdateuser(user);
				//System.out.println(binsert);
				if(binsert){
					if("�޸�".equals(type)){
						System.out.println("�����޸ĳɹ���");
					}
					else{
						System.out.println("�޸��û��ɹ���");
					}
				}else{
					if("�޸�".equals(type)){
						System.out.println("�����޸�ʧ�ܣ�");
					}else{
						System.out.println("�޸��û�ʧ�ܣ�");
					}	
				}			
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("�޸��û�ʧ�ܣ�");
			}
		}
	/**
	 * ����ͼ��id�Ų���ͼ�鷽��
	 * 
	 */
	public void searchBookshow() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BookVO book = null;
		try {
			
			System.out.println("          --��ӭ����ͼ����ϢID��ѯ����--");
			System.out.println("-------------------------------------------");
			BookController bc = new BookController();
			System.out.println("���������ͼ��id��");
			int bid = input.nextInt();
			book = bc.dofindBookByid(bid);
			System.out.println("ͼ����             ͼ����        ����      ͼ��״̬");
			System.out.println(""+book.getBid()+"      "+book.getBname()+"            "+book.getBauthor()+"       "+book.getBstate()+"");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ͼ����Ϣ����ʧ�ܣ�"+e.getMessage());
		}
	}
	
	/**
	 * ��������ͼ��Ϣ����
	 * @return ����Vector<BookVO>
	 */
	public Vector<BookVO> searchAllBookshow() {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);
		Vector<BookVO> v = null;
		try {
			BookController uc = new BookController();
			v = uc.dofindAllBook();
			System.out.println("         --��ӭ�����ѯ����ͼ�����--");
			System.out.println("-------------------------------------------");
			System.out.println("ͼ����             ͼ����        ����      ͼ��״̬");
			for(BookVO book:v)
			{
				
				System.out.println(""+book.getBid()+"      "+book.getBname()+"            "+book.getBauthor()+"       "+book.getBstate()+"");		
			    System.out.println("---------------------------------------");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����Ա�û���Ϣ����ʧ�ܣ�"+e.getMessage());
		}	
		return v;
	}
}
