package Generic;
/*
 * �����͵Ľӿڵڶ���ʹ�÷�����
 * �ӿ�ʹ��ʲô���ͣ�ʵ�����ʹ��ʲô����
 * ��ʽ��
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
