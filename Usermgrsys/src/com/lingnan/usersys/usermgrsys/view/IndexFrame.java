package com.lingnan.usersys.usermgrsys.view;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import com.lingnan.usersys.usermgrsys.controller.UserController;
import com.lingnan.usersys.usermgrsys.domian.UserVO;
/**
 * �����û���¼��ע����ͼ
 * @author Administrator
 *
 */
public class IndexFrame implements BaseFrame{
     
	/**
	 * ��ʾ��ҳ��
	 */
	public void show() {
		//������
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("            --��ӭ������ʦͼ�����ϵͳ--          "); 
			System.out.println("*-**************************************-*"); 
			System.out.println("*             1.��¼                                                                   *");       
			System.out.println("*             2.ע��                                                                   *");
			System.out.println("*             3.�˳�ϵͳ                                                           *");
			System.out.println("*-**************************************-*");
			int i =-1 ;
			System.out.println("������1~3�����֣�");
			while(true){
				try {
					 i = input.nextInt();
					 break;
				} catch (Exception e) {
					System.out.println("ֻ������1~3������");
					System.out.println("����������...");
				}
			}
			switch (i) {
			case 1:
				this.loginshow();
				break;
			case 2:
				this.addshow("ע��");
				break;
			case 3:
				System.out.println("���˳�ϵͳ��лл����ʹ�ã�");
				System.exit(0);
			default:
				System.out.println("����������ݲ��������������룡");
			}
		}	
	}
	/**
	 * ��¼��ͼ
	 */
    public void loginshow(){
    	Scanner input = new Scanner(System.in);
    	System.out.println("*----------------��ӭ�����¼ҳ��-------------*");       
		System.out.println("*----------------------------------------*");
		System.out.println("�������¼�˺ţ�                                                                               ");
		try {
			String id = input.next();
			System.out.println("�������¼���룺                                                                               ");
			String pass = input.next();
			UserController c = new UserController();
			UserVO user = c.dologin(id,pass);
//			String aid = user.getAid();
//			System.out.println("���Ʋ�"+aid);
		    if(user!=null){
		    	int power = user.getPower();
		    	System.out.println(power);
		    	String power1=null;
		    	if(power==1){
		    		 power1="����Ա";
		    		 System.out.println("��¼�ɹ���                                                                                        "); 
		    		 //System.out.println("&--------------��ӭ�������Ա����--------&");
					 System.out.println("*----------------------------------------*");
					 System.out.println("��ã�"+user.getAname()+"                        "+"                ����Ȩ���ǣ�"+power1);
					 AdminFrame admin = new AdminFrame(user);
					 admin.show();
		    	}
		    	if(power==2){
		    		power1="��ͨ�û�";
		    		System.out.println("��¼�ɹ�..... ");
		    		//System.out.println("&-------------��ӭ������ͨ�û�����---------&");
					System.out.println("*----------------------------------------*");
					System.out.println("���ã�"+user.getAname()+"                        "+"                ����Ȩ���ǣ�"+power1);
					NormalFrame normal = new NormalFrame(user);
					normal.show();
		    	}	
				System.exit(0);
			}else {
				System.out.println("��¼ ʧ�ܣ�");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��¼ ʧ�ܣ�"+e.getMessage());
		}
		
    }
	/**
	 * ������ʾ����
	 */
	public void searchshow() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * �����ʾ����
	 */
	public void addshow(String type) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		if("ע��".equals(type)){
			System.out.println("               --��ӭ�����û�ע�����--");
			System.out.println("*----------------------------------------*");
		}else{
			
		}
		System.out.println("�����������˺ţ�");
		try {
			UserVO user = new UserVO();
			user.setAid(input.next());
			System.out.println("�������������룺");
			user.setApassword(input.next());
			System.out.println("�����������ǳƣ�");
			user.setAname(input.next());
			UserController uc = new UserController();
			boolean binsert = uc.doadduser(user);
			if(binsert){
				if("ע��".equals(type)){
					System.out.println("�û�ע��ɹ���");
				}
				else{
					System.out.println("����û��ɹ���");
				}
			}else{
				if("ע��".equals(type)){
					System.out.println("�û�ע��ʧ�ܣ�");
				}else{
					System.out.println("����û�ʧ�ܣ�");
				}
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����û�ʧ�ܣ�");
		}
	}

	/**
	 * ������ʾ��ʽ
	 */
	public void updateshow(String type, UserVO user) {
		// TODO Auto-generated method stub
		
	}
   	

}
