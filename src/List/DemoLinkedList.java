package List;

import java.util.LinkedList;

/* java.util.LinkedList implements List�ӿ�
 * 
 * LinkedList���ϵ��ص㣺
 * 		1.�ײ���һ������ṹ����ѯ������ɾ��
 * 		2.��Ϊ��������������������Ԫ�غ�βԪ�صķ���
 * 		ע�⣺ʹ��LinkedList�����з���������ʹ�ö�̬
 * ���÷�����
 * 		`public void addFirst(E e)`:��ָ��Ԫ�ز�����б�Ŀ�ͷ��
 *		`public void addLast(E e)`:��ָ��Ԫ����ӵ����б�Ľ�β��
 *  	`public void push(E e)`:��Ԫ��������б�����ʾ�Ķ�ջ��
 *
 * 		`public E getFirst()`:���ش��б�ĵ�һ��Ԫ�ء�
 * 		`public E getLast()`:���ش��б�����һ��Ԫ�ء�
 * 
 * 		`public E removeFirst()`:�Ƴ������ش��б�ĵ�һ��Ԫ�ء�
 * 		`public E removeLast()`:�Ƴ������ش��б�����һ��Ԫ�ء�
 * 		`public E pop()`:�Ӵ��б�����ʾ�Ķ�ջ������һ��Ԫ�ء�
 *
 * 		`public boolean isEmpty()`������б�����Ԫ�أ��򷵻�true��
 * 
 */
public class DemoLinkedList {
	public static void main(String[] args) {
		show01();
		show02();
		show03();
	}
	
	private static void show03() {
		LinkedList<Double> linked = new LinkedList<>();/*����ʹ�ö�̬��ԭ�򣺵ײ�������*/
		linked.add(0.01);
		linked.add(0.02);
		linked.add(0.03);
		
		System.out.println(linked);
		
		Double obj1 = linked.removeFirst();
		Double obj2 = linked.removeLast();
		System.out.println("�Ƴ�����Ԫ�أ�" + obj1);
		System.out.println("�Ƴ���βԪ�أ�" + obj2);
		
		linked.add(6.6);
		System.out.println(linked);
		Double obj3 = linked.pop();
		System.out.println("popһ��Ԫ�أ�"  + obj3); /*pop �൱��getFirst ȡ��ջ������Ԫ�أ�*/
		
	}

	private static void show02() {
		LinkedList<Integer> linked = new LinkedList<>();
		linked.add(1);
		linked.add(2);
		linked.add(3);
		
		int obj1 = linked.getFirst();
		int obj2 = linked.getLast();
		
		System.out.println(linked);
		System.out.println("������Ԫ�أ�" + obj1);
		System.out.println("����βԪ�أ�" + obj2);
		
		linked.clear();
		
		//System.out.println(linked.getFirst()); /*������Ϊ��ʱ�����׳��쳣java.util.NoSuchElementException*/
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
		
		linked.push("-1"); /*�൱��addFirst*/
		
		System.out.println(linked);
		
	}

}
