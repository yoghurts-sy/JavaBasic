package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
 * ���͵�ͨ���
 * �����ǲ�֪����Ҫʹ�õķ�����ʲô����ʱʹ��
 * ��ʽ<?>
 * ע�ⷺ��û�м̳и��� ������
 */
public class GenericAny {

	public static void main(String[] args) {
		ArrayList<String> list01 = new ArrayList<>();
		list01.add("a");
		list01.add("b");
		
		ArrayList<Integer> list02 = new ArrayList<>();
		list02.add(1);
		list02.add(2);
		
		Print(list01);
		Print(list02);
		
		/*
		 * ����ͨ����ĸ߼�ʹ�ã����޷���
		 * 1. <? extends Class e> ������ֻ����e���������
		 * 2. <? super Class e> ���棿ֻ����e�ĸ������
		 * ע�� Integer extends Number extends Object
		 *      String extends Object
		 */
		Collection<Integer> list1 = new ArrayList<Integer>();
	    Collection<String> list2 = new ArrayList<String>();
	    Collection<Number> list3 = new ArrayList<Number>();
	    Collection<Object> list4 = new ArrayList<Object>();
	    /*
	    getElement1(list1);
	    getElement1(list2);//����
	    getElement1(list3);
	    getElement1(list4);//����
	  
	    getElement2(list1);//����
	    getElement2(list2);//����
	    getElement2(list3);
	    getElement2(list4);
	    */
	}
	
	public static void Print(ArrayList<?> list) {
		Iterator<?> it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
	}
	  
	// ���͵����ޣ���ʱ�ķ���?��������Number���ͻ���Number���͵�����
	public static void getElement1(Collection<? extends Number> coll){}
	// ���͵����ޣ���ʱ�ķ���?��������Number���ͻ���Number���͵ĸ���
	public static void getElement2(Collection<? super Number> coll){}
	

}
