package com.Java.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/* 使用泛型 (泛型只能是引用类型，不能是基本类型,除以下两个外其他都是首字母大写）
 * 基本类型            包装类
 * 	int 		  Integer
 *  char 		  Character
 * 
 * 好处：
 * 		1.避免了数据转化的麻烦，存储是什么类型，输出就是什么类型
 * 		2.把不使用泛型运行期可能抛出的异常，提前到编译器
 * 缺点：
 * 		一旦泛型确定，不能改变
 * 
 *  不使用泛型的
 *  好处：
 *  	1可以存储任意类型的数据
 *  缺点：
 *  	不安全可能发生异常
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
			 
			 String s = (String)obj;//向下转型
			 System.out.println(s.length());
			 /*
			  * 会抛异常java.lang.ClassCastException
			  * 因为1不可以强制转化为String类型。
			  */
		 }
		 
	}
}
