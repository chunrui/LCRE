package com.lingnan.usersys.common.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.lingnan.usersys.common.exception.DaoException;
import com.lingnan.usersys.common.exception.DateException;

/**
 * ����ת��������
 * @author Administrator
 *  
 */
public class TypeUtils {
	/**
	 * �ַ���ת��Ϊ����
	 * @param str  ָ�����ַ���
	 * @return ת���������
	 */
	public static Date strToDate(String str){
	     Date date =null;
	   //����Ҫ��ʽ��������
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         try {
        	 //����parse���������ַ���ת��Ϊ����
	           date = sdf.parse(str);
            } catch (ParseException e) {
            	//�Զ����쳣��
            	throw new DateException("�ַ���ת��Ϊ���ڳ���...",e);
    }
          //����ת�����ֵ
         return date;		
	}

	/**
	 * ����ת��Ϊ�ַ���
	 * @param date ָ�������ڲ���
	 * @return ת���������
	 */
	public static String dateToStr(Date date){
	     String str =null;
	     //����Ҫ��ʽ��������
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         try {
        	 //����format������������ת��Ϊ�ַ���
    	       str = sdf.format(date);
             } catch (Exception e) {
            	//�Զ����쳣��
              throw new DateException("����ת��Ϊ�ַ�������...",e);
                  
             }
         //����ת�����ֵ
          return str;		
	    }
	/**
     * ��֤����
     * @param email ����
     * @return ���ز���ֵ
     */
    public static boolean checkEmail(String email){
        boolean flag = false;
        try{
        	      //����������ʽ���
                String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
                Pattern regex = Pattern.compile(check);
                Matcher matcher = regex.matcher(email);
                flag = matcher.matches();
            }catch(Exception e){
                flag = false;
            }
        return flag;
    }
}
