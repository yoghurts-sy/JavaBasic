package com.Java.collocation;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

/*`Iterator`主要用于迭代访问（即遍历）`Collection`中的元素
 * 因此`Iterator`对象也被称为迭代器
 * 
 * Iterator接口的常用方法如下：
 *
 * `public E next()`:返回迭代的下一个元素。
 * `public boolean hasNext()`:如果仍有元素可以迭代，则返回 true。
 */

/*
 * 迭代器原理：
 * 在调用Iterator的next方法之前，迭代器的索引位指向第一个元素之前
 * 当调用一次next时，迭代器的索引会向后移一位，以此类推，达到集合末尾。
 * 当索引已经指向结尾，再使用next会报错：NoSuchElementException
 */
public class CollectionIterator {
		public static void main(String[] args) {
			/*
			 * 使用多态创建对象
			 */
			Collection<String> coll = new ArrayList<String>();
			
			coll.add("南宁");
			coll.add("是我的家乡");
			coll.add("她有绿城的美誉");
			
			Iterator<String> it = coll.iterator();
			
			while (it.hasNext()) {
				String msg = it.next();
				System.out.println(msg);
			}
			
			/*System.out.println(it.next());*/
		}
}
