package List;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * LinkedHashSet extends HashSet
 * LinkedHashSet集合的特点：
 * 		由哈希表（数组+（链表or红黑树）） + 链表构成，多了一条链表来记录数据的顺序，保证了元素的有序性。
 * 		也不能存储相同的元素。
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
