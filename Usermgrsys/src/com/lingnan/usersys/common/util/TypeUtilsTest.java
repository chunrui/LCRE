package com.lingnan.usersys.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
/**
 * ����ת��������
 * @author Administrator
 *
 */
public class TypeUtilsTest {

	/**
	 * �ַ���ת��Ϊ���ڲ��Է���
	 */
	public void testStrToDate() {
		//fail("Not yet implemented");
		String str = "2018-10-10";
		 Date date = TypeUtils.strToDate(str);
		 System.out.print(date);
		
	}
	
	/**
	 * ����ת���ַ���Ϊ���Է���
	 */
	public void testDateToStr() {
		//fail("Not yet implemented");
		//��ʽ���ַ���
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 Date date = null;
		 try {
			 //�ַ���ת��Ϊ����
			date = sdf.parse("2018-6-9");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //����ת��Ϊ�ַ���
		 String str = TypeUtils.dateToStr(date);
		 System.out.print(str);
		
	}

	/**
	 * ������Է���
	 */
	public void testCheckEmail() {
		String email = "11111@qq.com";
		boolean flag = TypeUtils.checkEmail(email);
		System.out.print(flag);
	}
}
