package List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * java.util.Set���� extends Collection�ӿ�
 * Set���ϵ��ص㣺
 * 		1.������洢�ظ���Ԫ��
 * 		2.û������������ʹ�ù��������ķ�����Ҳ����ʹ����ͨ��forѭ��
 * 		3.����������Collection���ϲ�࣬��Ҫ�������ĺ���
 * 
 * java.util.HashSet implements Set
 * HashSet���ص㣺
 * 		1.������洢�ظ���Ԫ��
 * 		2.û������������ʹ�ù��������ķ�����Ҳ����ʹ����ͨ��forѭ��
 * 		3.��һ������ļ��ϣ��洢˳���ȡ��˳����ܲ�һ��
 * 		4.�ײ���һ��HashMap����ѯ���ٶȷǳ��죩
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
