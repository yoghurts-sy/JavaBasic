package com.Java.Collection;

import java.util.Collection;
import java.util.ArrayList;


/* 
 * ��ǿforѭ��(Ҳ��for eachѭ��)
 * ��**JDK1.5**�Ժ������һ���߼�forѭ��
 * ֻ��������������ͼ��ϵġ�
 */
public class CollectionNBFor {
	public static void main(String[] args) {
		Arr();
		Collection();
	}
	
	public static void Arr() {
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void Collection() {
		Collection<String> coll = new ArrayList<>();
		coll.add("����");
		coll.add("���̳�");
		
		for (String s : coll) {
			System.out.print(s);
		}
	}
}
