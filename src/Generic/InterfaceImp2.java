package Generic;
/*
 * 带泛型的接口第二种使用方法：
 * 接口使用什么泛型，实现类就使用什么泛型
 * 格式：
 *     public class imp<E> implements Interface<E>{
 *     }
 */
public class InterfaceImp2<E> implements GenericInterface<E>{

	@Override
	public void method(E e) {
		System.out.println(e);
		
	}

	@Override
	public E get(E e) {
		return e;
	}

	
}
