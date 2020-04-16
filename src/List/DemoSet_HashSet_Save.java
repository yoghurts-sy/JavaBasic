package List;

import java.util.HashSet;

/*
 * 利用HashSet存储自定义类型元素
 * 
 * Set存储的元素可以是：String, Integer, ..., Student, Person
 * 
 *  建立一个存储Person的Set集合
 *  要求：
 *   	 同名同年龄的人，视为同一个人，只能存储一次。
 *   
 *   所以我们必须重写(Override)hashCode方法和equals方法
 *   使得同名同年龄只能是同一个人
 */
public class DemoSet_HashSet_Save {

	public static void main(String[] args) {
		HashSet<DemoSet_HashSet_Save_Person> set = new HashSet<>();
		DemoSet_HashSet_Save_Person p1 = new DemoSet_HashSet_Save_Person("小红", 18);
		DemoSet_HashSet_Save_Person p2 = new DemoSet_HashSet_Save_Person("小红", 18);
		DemoSet_HashSet_Save_Person p3 = new DemoSet_HashSet_Save_Person("小红", 19);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		System.out.println(set);
		
	}

}
