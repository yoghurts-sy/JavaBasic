package Generic;
/*
 * �ӿ�ʵ����1:��һ�ַ���
 * ֱ�ӹ涨�ӿڵ�����
 * ��ʽ��
 *     public class imp implements Interface<E>{
 *     }
 */
public class InterfaceImp1 implements GenericInterface<String>{

	@Override
	public void method(String e) {
		System.out.println(e);
		
	}

	@Override
	public String get(String e) {
		return e;
	}
	
}
