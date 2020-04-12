package com.Java.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * java.util.List接口 extends java.util.Collection
 * List接口的特点：
 * 		1.序列，存储元素和取出元素的顺序是一样的
 * 		2.有索引，可以根据索引找到元素，并进行修改等操作
 * 		3.允许存储重复的元素
 * 
 * List接口中除Collection接口外特有的方法：
 * 		public void add(int index, E element):将指定的元素，添加到该集合中的指定位置上。
 * 		public E get(int index):返回集合中指定位置的元素。
 * 		public E remove(int index):移除列表中指定位置的元素,返回的是被移除的元素。
 * 		public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素
 * 
 * 注意：
 * 		防止索引越界
 * 		java.lang.IndexOutOfBoundsException
 */
public class DemoList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("B");
		list.add("C");
		list.add("a");
		
		System.out.println(list);   /*包含toString方法*/
		/*public void add(int index, E element):将指定的元素，添加到该集合中的指定位置上。*/
		list.add(3, "D");
		System.out.println(list);
		
		/*public E get(int index):返回集合中指定位置的元素。*/
		String obj1 = list.get(3);
		System.out.println(obj1);
		
		/*public E remove(int index):移除列表中指定位置的元素,返回的是被移除的元素。*/
		String obj2 = list.remove(4);
		System.out.println(obj2);
		
		/*public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素*/
		String obj3 = list.set(0, "A");
		System.out.println(obj3);
		
		/*三种循环方式*/
		for (int i = 0; i < list.size(); i++) {
			String obj4 = list.get(i);
			System.out.print(obj4);
		}
		
		System.out.println("\n----");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String obj5 = it.next();
			System.out.print(obj5);
		}
		
		System.out.println("\n----");
		
		for (String obj6 : list) {    //NBfor
			System.out.print(obj6);
		}
		
		/*越界异常*/
		/*
		String obj = list.get(100);
		System.out.println(obj);
		*/
	}

}
