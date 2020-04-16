package List;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * LinkedHashSet extends HashSet
 * LinkedHashSet���ϵ��ص㣺
 * 		�ɹ�ϣ������+������or��������� + �����ɣ�����һ����������¼���ݵ�˳�򣬱�֤��Ԫ�ص������ԡ�
 * 		Ҳ���ܴ洢��ͬ��Ԫ�ء�
 */
public class DemoLinkedList_LinkedHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("def");
		set.add("abc");
		
		set.add("ghi");
		System.out.println(set); /*def abc ghi*/
		
		LinkedHashSet<String> linked = new LinkedHashSet<>();
		linked.add("abc");
		linked.add("def");
		
		linked.add("ghi");
		System.out.println(linked); /*abc def ghi*/

	}

}
