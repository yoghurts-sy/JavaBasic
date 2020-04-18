package Collection;

import java.util.ArrayList;
import java.util.Collection;


	/* 集合和数组既然都是容器，它们有啥区别呢？
	 * 数组的长度是固定的。集合的长度是可变的
	 * 数组中存储的是同一类型的元素，可以存储基本数据类型值。
	 * 集合存储的都是对象。而且对象的类型可以不一致。
	 * 
	 * Collection 常用功能 有序的
	 * 
	 * `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
	 * `public void clear()` :清空集合中所有的元素。
	 * `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
	 * `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
	 * `public boolean isEmpty()`: 判断当前集合是否为空。
	 * `public int size()`: 返回集合中元素的个数。
	 * `public Object[] toArray()`: 把集合中的元素，存储到数组中。
	 * 
	 * 
	 */

public class CollectionInterface {
		public static void main(String[] args) {
			/*
			 * 使用多态
			 */
			Collection<String> coll = new ArrayList<String>();

			coll.add("绿城");
			coll.add("是绿城");
			coll.add("南宁");

			System.out.println(coll);
			
			System.out.println("集合是否包含南宁：" + coll.contains("南宁"));
			
			System.out.println(coll.size());
			
			Object[] objects = coll.toArray();
			for (int i = 0; i < objects.length; i++) {
				System.out.println(objects[i]);
			}
				
			coll.remove("南宁");
			System.out.println(coll);
			
			coll.clear();
			
			System.out.println("集合是否为空：" + coll.isEmpty());
		}
}
