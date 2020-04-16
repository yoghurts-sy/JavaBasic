package List;

import java.util.LinkedList;

/* java.util.LinkedList implements List接口
 * 
 * LinkedList集合的特点：
 * 		1.底层是一个链表结构，查询慢，增删快
 * 		2.因为是链表，包含大量关于首元素和尾元素的方法
 * 		注意：使用LinkedList的特有方法，不能使用多态
 * 常用方法：
 * 		`public void addFirst(E e)`:将指定元素插入此列表的开头。
 *		`public void addLast(E e)`:将指定元素添加到此列表的结尾。
 *  	`public void push(E e)`:将元素推入此列表所表示的堆栈。
 *
 * 		`public E getFirst()`:返回此列表的第一个元素。
 * 		`public E getLast()`:返回此列表的最后一个元素。
 * 
 * 		`public E removeFirst()`:移除并返回此列表的第一个元素。
 * 		`public E removeLast()`:移除并返回此列表的最后一个元素。
 * 		`public E pop()`:从此列表所表示的堆栈处弹出一个元素。
 *
 * 		`public boolean isEmpty()`：如果列表不包含元素，则返回true。
 * 
 */
public class DemoLinkedList {
	public static void main(String[] args) {
		show01();
		show02();
		show03();
	}
	
	private static void show03() {
		LinkedList<Double> linked = new LinkedList<>();/*不能使用多态，原因：底层是链表*/
		linked.add(0.01);
		linked.add(0.02);
		linked.add(0.03);
		
		System.out.println(linked);
		
		Double obj1 = linked.removeFirst();
		Double obj2 = linked.removeLast();
		System.out.println("移除的首元素：" + obj1);
		System.out.println("移除的尾元素：" + obj2);
		
		linked.add(6.6);
		System.out.println(linked);
		Double obj3 = linked.pop();
		System.out.println("pop一个元素："  + obj3); /*pop 相当于getFirst 取出栈顶（首元素）*/
		
	}

	private static void show02() {
		LinkedList<Integer> linked = new LinkedList<>();
		linked.add(1);
		linked.add(2);
		linked.add(3);
		
		int obj1 = linked.getFirst();
		int obj2 = linked.getLast();
		
		System.out.println(linked);
		System.out.println("链表首元素：" + obj1);
		System.out.println("链表尾元素：" + obj2);
		
		linked.clear();
		
		//System.out.println(linked.getFirst()); /*当链表为空时，会抛出异常java.util.NoSuchElementException*/
	}

	public static void show01() {
		LinkedList<String> linked = new LinkedList<>();
		linked.add("1");
		linked.add("2");
		linked.add("3");
		
		System.out.println(linked);
		
		linked.addFirst("0");
		linked.addLast("4");
		
		System.out.println(linked);
		
		linked.push("-1"); /*相当于addFirst*/
		
		System.out.println(linked);
		
	}

}
