package com.Java.List;

import java.util.HashSet;

/*
 * HashSet集合存储数据的结构（哈希表）查询快
 * JDK 1.8以前 哈希表 = 数组 + 链表
 * JDK 1.8之后 哈希表 = 数组 + （链表 or 红黑树） 即横向数组，纵向链表 or 红黑树。
 * 
 * 数据结构：把元素进行了分组，把哈希值相同的元素连在一起。
 *  		 如果链表的长度超过了8位，那么链表转化为红黑树。
 *  
 *  Set集合存储元素不重复的原理：
 *  	在调用add方法时，add方法会去调用Set集合的hashCode方法和equals方法
 *  	1.获取要添加的元素的hashCode，去比较集合中有没有这个哈希值的元素，如果没有则插入。
 *  	2.如果已有相同的哈希值元素，即发生了哈希冲突，就会调用equals方法，如果equals返回false则插入；如果返回true则不插入。
 *  
 */
public class DemoSet_HashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		String s1 = new String("abc");
		String s2 = new String("abc");
		set.add(s1);
		set.add(s2);
		
		set.add("重地");
		set.add("通话");
		set.add("abc");
		
		System.out.println(set);
	}

}
