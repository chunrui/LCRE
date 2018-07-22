package com.lingnan.usersys.usermgrsys.view;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import com.lingnan.usersys.usermgrsys.controller.BookController;
import com.lingnan.usersys.usermgrsys.controller.ReaderController;
import com.lingnan.usersys.usermgrsys.controller.UserController;
import com.lingnan.usersys.usermgrsys.domian.BookVO;
import com.lingnan.usersys.usermgrsys.domian.ReaderVO;
import com.lingnan.usersys.usermgrsys.domian.UserVO;
/**
 * ����Ա��ͼ��
 * @author Administrator
 *
 */
public class AdminFrame extends NormalFrame{
	/**
	 * �����������������ڳ�ʼ��user����
	 * @param user �û���Ϣ
	 */
	public AdminFrame(UserVO user){
		super(user);
	}
	/**
	 * �����������������ڳ�ʼ��user����
	 * @param user �û���Ϣ
	 */
	public AdminFrame(BookVO book){
		super(book);
	}
	/**
	 * ����Աչʾ�����Ƿ���
	 */
	public void show(){
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("            --��ӭ�������Ա����--             ");
			System.out.println("*-**************************************-*"); 
			System.out.println("*             1.������Ϣ����                                                   *");       
			System.out.println("*             2.�û���Ϣ����                                                    *");
			System.out.println("*             3.ͼ����Ϣ����                                                    *");
			System.out.println("*             4.������Ϣ����                                                    *");
			System.out.println("*             5.�˳�ϵͳ                                                            *");
			System.out.println("*-**************************************-*");
			int i =-1 ;
			System.out.println("������1~4�����֣�");
			while(true){
				try {
					 i = input.nextInt();
					 break;
				} catch (Exception e) {
					System.out.println("ֻ������1~5������");
					System.out.println("����������...");
				}
			}
			switch (i) {
			case 1:{
			 while(true){
				System.out.println("           --��ӭ�������Ա������Ϣ����ģ��--      ");
				System.out.println("*-*************************************-*");
	    		System.out.println("*               1. �鿴������Ϣ                                        *");    
	    		System.out.println("*               2. �޸ĸ�����Ϣ                                        *"); 
	    		System.out.println("*               3. ����                                                        *");
	    		System.out.println("*-*************************************-*");
	    		System.out.println("������1����2��3");
	    		int b1=input.nextInt();	
	    		switch(b1)          
    	    	{                  
    	    	case 1:
    	    		this.searchshow(user);break;
    	    	case 2:
    	    		this.updateshow("����Ա",user);break;
    	    	case 3:
    	    		this.show();break;
	    		} 
	    		}
    	    	}
			case 2:
				while(true){
					System.out.println("           --��ӭ�����û���Ϣ����ģ��--          ");
					System.out.println("*-*************************************-*");
		    		System.out.println("*               1. �鿴�û���Ϣ                                        *");    
		    		System.out.println("*               2. �޸��û���Ϣ                                        *");
		    		System.out.println("*               3. ����û���Ϣ                                        *");    
		    		System.out.println("*               4. ɾ���û���Ϣ                                        *"); 
		    		System.out.println("*               5. ����                                                        *");
		    		System.out.println("*-*************************************-*");
		    		System.out.println("������1~5");
		    		int b1=input.nextInt();	
		    		switch(b1)          
	    	    	{                  
	    	    	case 1:
	    	    		this.searchAllUsershow();break;
	    	    	case 2:
	    	    		this.updateUsershow();break;
	    	    	case 3:
	    	    		this.addshow("�û�");break;
	    	    	case 4:
	    	    		this.deleteshow("�û�");break;
	    	    	case 5:
	    	    		this.show();break;
		    		} 
	    	    	}
			case 3:
				while(true){
					System.out.println("           --��ӭ����ͼ����Ϣ����ģ��--      ");
					System.out.println("*-**************************************-*");
		    		System.out.println("*               1. �鿴ͼ����Ϣ                                         *");    
		    		System.out.println("*               2. �޸�ͼ����Ϣ                                         *");
		    		System.out.println("*               3. ���ͼ����Ϣ                                         *");    
		    		System.out.println("*               4. ɾ��ͼ����Ϣ                                         *"); 
		    		System.out.println("*               5. ����                                                         *");
		    		System.out.println("*-**************************************-*");
		    		System.out.println("������1~5");
		    		int b1=input.nextInt();	
		    		switch(b1)          
	    	    	{                  
	    	    	case 1:
	    	    		while(true){
	    					System.out.println("             --��ӭ����ͼ����Ϣ��ѯģ��--      ");
	    					System.out.println("*-***********************************-*"); 
	    		    		System.out.println("*               1. ��ѯ����ͼ����Ϣ                        *");    
	    		    		System.out.println("*               2. ��id��ѯͼ����Ϣ                       *");
	    		    		System.out.println("*               3. ��ͼ����ģ����ѯͼ����Ϣ         *");    
	    		    		System.out.println("*               4. ����ҳ��ѯͼ����Ϣ                     *");
	    		    		System.out.println("*               5. ����                                                 *");
	    		    		System.out.println("*-***********************************-*"); 
	    		    		System.out.println("������1~5");
	    		    		
	    		    		int b2=input.nextInt();	
	    		    		switch(b2)          
	    	    	    	{                  
	    	    	    	case 1:
	    	    	    		this.searchAllBookshow();break;
	    	    	    	case 2:
	    	    	    		this.searchBookshow();break; 
	    	    	    	case 3:
	    	    	    		this.searchBookBynameshow();break;
	    	    	    	case 4:
	    	    	    		this.searchBookBypage();break; 
	    					case 5:
	    			    		this.show();break;
	    	    	    	}
	    	    	    	}
	    	    	case 2:
	    	    		this.updatebookshow("ͼ��");break;
	    	    	case 3:
	    	    		this.addshow("ͼ��");break;
	    	    	case 4:
	    	    		this.deleteshow("ͼ��");break;
	    	    	case 5:
	    	    		this.show();break;
		    		} 
	    	    	}
			case 4:
				while(true){
				System.out.println("             --��ӭ���������Ϣ��ѯģ��--      ");
				System.out.println("*-**************************************-*"); 
	    		System.out.println("*              1. ��ѯ���ж�����Ϣ                                     *");    
	    		System.out.println("*              2. ��id��ѯ������Ϣ                                   *");
	    		System.out.println("*              3. ����                                                             *");
	    		System.out.println("*-**************************************-*");
	    		System.out.println("������1~3");
	    		int b1=input.nextInt();	
	    		switch(b1)          
    	    	{                  
    	    	case 1:
    	    		this.searchAllRedadershow();break;
    	    	case 2:
    	    		this.searchReadershow();break;
    	    	case 3:
    	    		this.show();break;
    	    	}
				}
			case 5:
				System.out.println("���˳�ϵͳ��лл����ʹ�ã�");
				System.exit(0);
			default:
				System.out.println("����������ݲ��������������룡");
			}
	}
}

/**
 * ����id������ʾ����
 * @param user �û�����
 */
public void searchshow(UserVO user) {
	// TODO Auto-generated method stub
	//Scanner input = new Scanner(System.in);
	try {
		String power1 ="����Ա";
		System.out.println("        --��ӭ�������Ա������Ϣ��ѯ����--");
		System.out.println("---------------------------------------");
		System.out.println("���             �ǳ�               ����                       Ȩ��");
		System.out.println(""+user.getAid()+"    "+user.getAname()+"          "+user.getApassword()+"     "+power1+"");
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("����Ա������Ϣ����ʧ�ܣ�"+e.getMessage());
	}	
}
/**
 * ���������û���Ϣ����
 * @return Vector<UserVO> 
 */
public Vector<UserVO> searchAllUsershow() {
	// TODO Auto-generated method stub
	//Scanner input = new Scanner(System.in);
	Vector<UserVO> v = null;
	try {
		UserController uc = new UserController();
		v = uc.dofindAllUser();
		String power1 =null;
		System.out.println("         --��ӭ�����û���Ϣ��ѯ����--");
		System.out.println("---------------------------------------");
		System.out.println("���             �ǳ�               ����                       Ȩ��");
		for(UserVO sd:v)
		{
			int t = sd.getPower();
			if(t==1){
				power1 ="����Ա";
			}else{
				power1 ="��ͨ�û�";
			}
			System.out.println(""+sd.getAid()+"    "+sd.getAname()+"          "+sd.getApassword()+"     "+power1+"");
			System.out.println("---------------------------------------");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("����Ա�û���Ϣ����ʧ�ܣ�"+e.getMessage());
	}
	
	return v;
}
/**
 * �����û���Ϣ����
 * @param type ����
 * @param user �û�����
 */
public void updateshow(String type, UserVO user) {
	Scanner input = new Scanner(System.in);
	if("�û�".equals(type)){
		System.out.println("        --��ӭ�����û���Ϣ�޸ý���--");
		System.out.println("---------------------------------------");
	}else{
			System.out.println("    --��ӭ�������Ա������Ϣ�޸Ľ�--");
			System.out.println("---------------------------------------");
		}
		
		try {
			System.out.println("��������Ҫ�޸ĵ��˺ţ�");
			user.setAid(input.next());
			System.out.println("��������Ҫ�޸ĵ����룺");
			user.setApassword(input.next());
			System.out.println("��������Ҫ�޸ĵ��ǳƣ�");
			user.setAname(input.next());
			user.setPower(1);
			String power = "����Ա";
			System.out.println("---------------------------------------");
			System.out.println("�޸ĺ�ĸ�����Ϣ��");
			System.out.println("���             �ǳ�               ����                       Ȩ��");
			UserController uc = new UserController();
			System.out.println(""+user.getAid()+"    "+user.getAname()+"          "+user.getApassword()+"     "+power+"");
			boolean binsert = uc.doupdateuser(user);
			//System.out.println(binsert);
			if(binsert){
				if("�û�".equals(type)){
					System.out.println("����Ա�����޸ĳɹ���");
				}
				else{
					System.out.println("�޸Ĺ���Ա���˳ɹ���");
				}
			}else{
				if("�û�".equals(type)){
					System.out.println("����Ա�����޸�ʧ�ܣ�");
				}else{
					System.out.println("�޸Ĺ���Ա����ʧ�ܣ�");
				}	
			}			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�޸Ĺ���Ա����ʧ�ܣ�");
		}
	}
/**
 *  ����ͼ��id�Ų���ͼ�鷽��
 */
public void searchBookshow() {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	BookVO book = null;
	try {
		
		System.out.println("        --��ӭ����ͼ����Ϣ��ѯ����--");
		System.out.println("---------------------------------------");
		BookController bc = new BookController();
		System.out.println("���������ͼ��id��");
		int bid = input.nextInt();
		book = bc.dofindBookByid(bid);
		System.out.println("ͼ����     ͼ����        ����      ͼ��״̬");
		System.out.println(""+book.getBid()+"      "+book.getBname()+"            "+book.getBauthor()+"       "+book.getBstate()+"");
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("ͼ����Ϣ����ʧ�ܣ�"+e.getMessage());
	}
	
	
}
/**
 * ���չʾ����
 */
public void addshow(String type) {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	if("�û�".equals(type)){
		System.out.println("            --��ӭ�����û���ӽ���--          ");
		System.out.println("---------------------------------------");
		System.out.println("�������û����˺ţ�");
		try {
			UserVO user = new UserVO();
			user.setAid(input.next());
			System.out.println("�������û������룺");
			user.setApassword(input.next());
			System.out.println("�������û����ǳƣ�");
			user.setAname(input.next());
			System.out.println("�������û���Ȩ�ޣ�");
			String power = input.next();
			if(power.equals("����Ա")){
				user.setPower(1);
			}
			else{
				user.setPower(2);
			}
			UserController uc = new UserController();
			boolean binsert = uc.doadduser(user);
			if(binsert){
				if("�û�".equals(type)){
					System.out.println("�û���ӳɹ���");
				}
				else{
					
				}
			}else{
				if("�û�".equals(type)){
					System.out.println("�û����ʧ�ܣ�");
				}else{
					System.out.println("����û�ʧ�ܣ�");
				}
				
			}	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����û�ʧ�ܣ�");
		}
	}else{
		try{
		System.out.println("            --��ӭ����ͼ����ӽ���--          ");
		System.out.println("---------------------------------------");	
		BookVO book = new BookVO();
//		System.out.println("������ͼ���ţ�");
//		book.setBid(input.nextInt());
		System.out.println("������ͼ�����ƣ�");
		book.setBname(input.next());
		System.out.println("������ͼ�����ߣ�");
		book.setBauthor(input.next());
		System.out.println("������ͼ��״̬��");
		book.setBstate(input.next());
		BookController uc = new BookController();
		boolean binsert = uc.doaddbook(book);
		if(binsert){
			if("ͼ��".equals(type)){
				System.out.println("ͼ����ӳɹ���");
			}
			else{
				System.out.println("ͼ�����ʧ�ܣ�");
			}
		}else{
			if("ͼ��".equals(type)){
				System.out.println("ͼ�����ʧ�ܣ�");
			}else{
				System.out.println("���ͼ��ʧ�ܣ�");
			}
		}	
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("����û�ʧ�ܣ�");
	}
	}
	
}

/**
 * ɾ����ʾ����
 */
public void deleteshow(String type) {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	if("�û�".equals(type)){
		System.out.println("            --��ӭ�����û�ɾ������--          ");
		System.out.println("---------------------------------------");
		System.out.println("������Ҫɾ���û����˺ţ�");
		try {
			UserVO user = new UserVO();
			String aid = input.next();
			UserController uc = new UserController();
			boolean binsert = uc.dodeleteuser(aid);
			if(binsert){
					System.out.println("�û�ɾ���ɹ���");
				}
				else{
					System.out.println("�û�ɾ��ʧ�ܣ�");
				}
			}catch (Exception e) {
					// TODO: handle exception
					System.out.println("����û�ʧ�ܣ�");
				}
		}
	else{
		System.out.println("            --��ӭ����ͼ��ɾ������--          ");
		System.out.println("---------------------------------------");
		System.out.println("������Ҫɾ��ͼ����˺ţ�");
		try {
			BookVO book = new BookVO();
			int bid = input.nextInt();
			BookController uc = new BookController();
			boolean binsert = uc.dodeletebook(bid);
			if(binsert){
					System.out.println("ͼ��ɾ���ɹ���");
				}
				else{
					System.out.println("ͼ��ɾ��ʧ�ܣ�");
				}
			}catch (Exception e) {
					// TODO: handle exception
					System.out.println("���ͼ��ʧ�ܣ�");
				}
	}
}
//ͼ�鷽��
/**
 * ��������ͼ��Ϣ����
 */
public Vector<BookVO> searchAllBookshow() {
	// TODO Auto-generated method stub
	//Scanner input = new Scanner(System.in);
	Vector<BookVO> v = null;
	try {
		BookController uc = new BookController();
		v = uc.dofindAllBook();
		System.out.println("          --��ӭ����ͼ��Ϣ��ѯ����--");
		System.out.println("---------------------------------------");
		System.out.println("ͼ����   ͼ����        ����      ͼ��״̬");
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

/**
 * ����ͼ�鷽��
 */
public void updatebookshow(String type) {
	Scanner input = new Scanner(System.in);
	if("ͼ��".equals(type)){
		System.out.println("           --��ӭ����ͼ����Ϣ�޸ý���--");
		System.out.println("---------------------------------------");
	}else{
			
		}
		try {
			BookController uc = new BookController();
			System.out.println("��������Ҫ�޸�ͼ��ı�ţ�");
			int bid = input.nextInt();
			BookVO book = uc.dofindBookByid(bid);
			System.out.println("---------------------------------------");
			System.out.println("�������޸�ͼ���ţ�");
			book.setBid(input.nextInt());
			System.out.println("�������޸�ͼ�����ƣ�");
			book.setBname(input.next());
			System.out.println("�������޸�ͼ�����ߣ�");
			book.setBauthor(input.next());
			System.out.println("�������޸�ͼ��״̬��");
			book.setBstate(input.next());
			
			boolean binsert = uc.doupdatbook(book);
			if(binsert){
					System.out.println("ͼ����Ϣ�޸ĳɹ���");
			}else{
				
					System.out.println("ͼ����Ϣ�޸�ʧ�ܣ�");
			}			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ͼ����Ϣ�޸�ʧ�ܣ���");
		}
	}
/**
 * �û����·���
 */
public void updateUsershow() {
	Scanner input = new Scanner(System.in);
	System.out.println("        --��ӭ�����û���Ϣ�޸Ľ���--");
	System.out.println("---------------------------------------");
		try {
			UserController uc = new UserController();
//			System.out.println("��������Ҫ�޸���Ϣ�ı�ţ�");
//			String bid = input.next();
//			UserVO user = uc.dofindUserByid(bid);
//			System.out.println("------------------------------------------");
			System.out.println("��������Ҫ�޸ĵ��˺ţ�");
			user.setAid(input.next());
			System.out.println("��������Ҫ�޸ĵ����룺");
			user.setApassword(input.next());
			System.out.println("��������Ҫ�޸ĵ��ǳƣ�");
			user.setAname(input.next());
			System.out.println("��������Ҫ�޸ĵ�Ȩ�ޣ�");
			String power = input.next();
			if(power.equals("����Ա"))
			{
				user.setPower(1);
			}else{
				user.setPower(2);
			}
			
			System.out.println("---------------------------------------");
			System.out.println("�޸ĺ�ĸ�����Ϣ��");
			System.out.println("���             �ǳ�               ����                       Ȩ��");
			System.out.println(""+user.getAid()+"    "+user.getAname()+"          "+user.getApassword()+"     "+power+"");
			boolean binsert = uc.doupdateuser(user);
			//System.out.println(binsert);
			if(binsert){
				System.out.println("�û���Ϣ�޸ĳɹ���");
			}else{
				System.out.println("�û���Ϣ�޸�ʧ�ܣ�");	
			}			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�û���Ϣ�޸�ʧ�ܣ�");	
		}
	}
/**
 *  ����ͼ������ģ������ͼ�鷽��
 * 
 */
public void searchBookBynameshow() {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	Vector<BookVO>  v = new Vector<BookVO>();
	try {
		
		System.out.println("        --��ӭ����ͼ����Ϣ��ѯ����--");
		System.out.println("---------------------------------------");
		BookController bc = new BookController();
		System.out.println("���������ͼ������");
		String name = input.next();
		v = bc.dofindBookByName(name);
		System.out.println("ͼ����     ͼ����        ����      ͼ��״̬");
		for(BookVO book:v)
		{
		  System.out.println(""+book.getBid()+"      "+book.getBname()+"            "+book.getBauthor()+"       "+book.getBstate()+"");
		  System.out.println("---------------------------------------");
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("��ͼ��������ͼ����Ϣʧ�ܣ�"+e.getMessage());
	}	
}
 /**
  * ��ҳ��ѯͼ����Ϣ
  */
    public void  searchBookBypage(){
	// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Vector<BookVO> v = new Vector<BookVO>();
		try {
			
			System.out.println("        --��ӭ����ͼ����Ϣ��ѯ����--");
			System.out.println("---------------------------------------");
			BookController bc = new BookController();
			System.out.println("���������ҳ�ţ�");
			int pageNo = input.nextInt();
			System.out.println("���������ҳ��С��");
			int pagesize = input.nextInt();
			v = bc.dofindBookBypage(pageNo,pagesize);
			System.out.println("ͼ����    ͼ����        ����      ͼ��״̬");
			for(BookVO book:v)
			{
			  System.out.println(""+book.getBid()+"      "+book.getBname()+"            "+book.getBauthor()+"       "+book.getBstate()+"");
			  System.out.println("---------------------------------------");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��ҳ����ͼ����Ϣʧ�ܣ�"+e.getMessage());
		}	
	}
 
    /**
     *  ���ݶ���id�Ų��Ҷ��߷���
     *
     */
  public void searchReadershow() {
    	// TODO Auto-generated method stub
    	Scanner input = new Scanner(System.in);
    	ReaderVO reader = null;
    	try {
    		
    		System.out.println("        --��ӭ���� ������Ϣ��ѯ����--");
    		System.out.println("---------------------------------------");
    		ReaderController bc = new ReaderController(); 
    		System.out.println("��������Ҷ���id��");
    		String bid = input.next();
    		reader = bc.dofindReaderByid(bid);
    		System.out.println("���߱��            ����       ����             �Ա�              �༶                  Ժϵ                          ���� ");
    		System.out.println(""+reader.getSid()+"      "+reader.getSname()+"       "+reader.getSage()+"     "+reader.getSsex()+"              "+reader.getSclassid()+"    "+reader.getSdepartment()+"           "+reader.getSemail()+"");    		
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("ͼ����Ϣ����ʧ�ܣ�"+e.getMessage());
    	}	
    }
  /**
   *  �������ж�����Ϣ
   * 
   */
public void searchAllRedadershow() {
  	// TODO Auto-generated method stub
  	Scanner input = new Scanner(System.in);
  	Vector<ReaderVO> v = new Vector<ReaderVO>();
  	try {
  		
  		System.out.println("        --��ӭ���� ������Ϣ��ѯ����--");
  		System.out.println("---------------------------------------");
  		ReaderController bc = new ReaderController(); 
  		v = bc.dofindAllReader();
  		System.out.println("���߱��            ����       ����             �Ա�              �༶                  Ժϵ                          ���� ");
  		for(ReaderVO reader:v){
  		System.out.println(""+reader.getSid()+"      "+reader.getSname()+"       "+reader.getSage()+"     "+reader.getSsex()+"              "+reader.getSclassid()+"    "+reader.getSdepartment()+"           "+reader.getSemail()+"");
  		System.out.println("---------------------------------------");
  		}
  	} catch (Exception e) {
  		// TODO: handle exception
  		System.out.println("ͼ����Ϣ����ʧ�ܣ�"+e.getMessage());
  	}	
  }
}
