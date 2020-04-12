package com.Java.Collection;

import java.util.Collection;
import java.util.ArrayList;


/* 
 * 增强for循环(也称for each循环)
 * 是**JDK1.5**以后出来的一个高级for循环
 * 只能用来遍历数组和集合的。
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
		coll.add("南宁");
		coll.add("是绿城");
		
		for (String s : coll) {
			System.out.print(s);
		}
	}
}
