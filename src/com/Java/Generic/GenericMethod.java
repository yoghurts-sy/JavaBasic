package com.Java.Generic;
/*
 * ���з��͵ķ���
 * ���Ͷ��������η��ͺͷ�������ֱ��
 * ��ʽ��
 * 		���η� <����> ����ֵ ������(�����б�ʹ�÷���){
 *  	�����壻
 *      }
 */
public class GenericMethod {
	public <M> void method(M m) {
		System.out.println(m);
	}
	
	public static <S> void method02(S s){
		System.out.println(s);
	}
}
