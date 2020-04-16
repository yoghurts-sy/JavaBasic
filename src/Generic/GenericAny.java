package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
 * 泛型的通配符
 * 当我们不知道所要使用的泛型是什么类型时使用
 * 格式<?>
 * 注意泛型没有继承概念 ？？？
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
		 * 泛型通配符的高级使用：受限泛型
		 * 1. <? extends Class e> 表明？只能是e的子类或本身
		 * 2. <? super Class e> 表面？只能是e的父类或本身
		 * 注意 Integer extends Number extends Object
		 *      String extends Object
		 */
		Collection<Integer> list1 = new ArrayList<Integer>();
	    Collection<String> list2 = new ArrayList<String>();
	    Collection<Number> list3 = new ArrayList<Number>();
	    Collection<Object> list4 = new ArrayList<Object>();
	    /*
	    getElement1(list1);
	    getElement1(list2);//报错
	    getElement1(list3);
	    getElement1(list4);//报错
	  
	    getElement2(list1);//报错
	    getElement2(list2);//报错
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
	  
	// 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
	public static void getElement1(Collection<? extends Number> coll){}
	// 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
	public static void getElement2(Collection<? super Number> coll){}
	

}
