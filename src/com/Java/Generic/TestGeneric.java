package com.Java.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/* ʹ�÷��� (����ֻ�����������ͣ������ǻ�������,������������������������ĸ��д��
 * ��������            ��װ��
 * 	int 		  Integer
 *  char 		  Character
 * 
 * �ô���
 * 		1.����������ת�����鷳���洢��ʲô���ͣ��������ʲô����
 * 		2.�Ѳ�ʹ�÷��������ڿ����׳����쳣����ǰ��������
 * ȱ�㣺
 * 		һ������ȷ�������ܸı�
 * 
 *  ��ʹ�÷��͵�
 *  �ô���
 *  	1���Դ洢�������͵�����
 *  ȱ�㣺
 *  	����ȫ���ܷ����쳣
 */
public class TestGeneric {
	public static void main(String[] args) {
		//unuse();
		use();
	}
	
	public static void use() {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("abc");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s.length());
		}
	}
	
	public static void unuse() {
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(1);
		 Iterator it = list.iterator();
		 
		 while (it.hasNext()) {
			 Object obj = it.next();
			 System.out.println(obj);
			 
			 String s = (String)obj;//����ת��
			 System.out.println(s.length());
			 /*
			  * �����쳣java.lang.ClassCastException
			  * ��Ϊ1������ǿ��ת��ΪString���͡�
			  */
		 }
		 
	}
}
