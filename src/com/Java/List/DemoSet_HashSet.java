package com.Java.List;

import java.util.HashSet;

/*
 * HashSet���ϴ洢���ݵĽṹ����ϣ����ѯ��
 * JDK 1.8��ǰ ��ϣ�� = ���� + ����
 * JDK 1.8֮�� ��ϣ�� = ���� + ������ or ������� ���������飬�������� or �������
 * 
 * ���ݽṹ����Ԫ�ؽ����˷��飬�ѹ�ϣֵ��ͬ��Ԫ������һ��
 *  		 �������ĳ��ȳ�����8λ����ô����ת��Ϊ�������
 *  
 *  Set���ϴ洢Ԫ�ز��ظ���ԭ��
 *  	�ڵ���add����ʱ��add������ȥ����Set���ϵ�hashCode������equals����
 *  	1.��ȡҪ��ӵ�Ԫ�ص�hashCode��ȥ�Ƚϼ�������û�������ϣֵ��Ԫ�أ����û������롣
 *  	2.���������ͬ�Ĺ�ϣֵԪ�أ��������˹�ϣ��ͻ���ͻ����equals���������equals����false����룻�������true�򲻲��롣
 *  
 */
public class DemoSet_HashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		String s1 = new String("abc");
		String s2 = new String("abc");
		set.add(s1);
		set.add(s2);
		
		set.add("�ص�");
		set.add("ͨ��");
		set.add("abc");
		
		System.out.println(set);
	}

}
