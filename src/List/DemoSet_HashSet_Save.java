package List;

import java.util.HashSet;

/*
 * ����HashSet�洢�Զ�������Ԫ��
 * 
 * Set�洢��Ԫ�ؿ����ǣ�String, Integer, ..., Student, Person
 * 
 *  ����һ���洢Person��Set����
 *  Ҫ��
 *   	 ͬ��ͬ������ˣ���Ϊͬһ���ˣ�ֻ�ܴ洢һ�Ρ�
 *   
 *   �������Ǳ�����д(Override)hashCode������equals����
 *   ʹ��ͬ��ͬ����ֻ����ͬһ����
 */
public class DemoSet_HashSet_Save {

	public static void main(String[] args) {
		HashSet<DemoSet_HashSet_Save_Person> set = new HashSet<>();
		DemoSet_HashSet_Save_Person p1 = new DemoSet_HashSet_Save_Person("С��", 18);
		DemoSet_HashSet_Save_Person p2 = new DemoSet_HashSet_Save_Person("С��", 18);
		DemoSet_HashSet_Save_Person p3 = new DemoSet_HashSet_Save_Person("С��", 19);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		System.out.println(set);
		
	}

}
