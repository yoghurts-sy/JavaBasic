package List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * java.util.Set集合 extends Collection接口
 * Set集合的特点：
 * 		1.不允许存储重复的元素
 * 		2.没有索引，不能使用关于索引的方法，也不能使用普通的for循环
 * 		3.其他方法和Collection集合差不多，主要介绍他的孩子
 * 
 * java.util.HashSet implements Set
 * HashSet的特点：
 * 		1.不允许存储重复的元素
 * 		2.没有索引，不能使用关于索引的方法，也不能使用普通的for循环
 * 		3.是一个无序的集合，存储顺序和取出顺序可能不一样
 * 		4.底层是一个HashMap（查询的速度非常快）
 */
public class DemoSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer obj = it.next();
			System.out.println(obj);
		}
		
		System.out.println("----");
		
		/*NBfor*/
		for (Integer obj : set) {
			System.out.println(obj);
		}

	}

}
