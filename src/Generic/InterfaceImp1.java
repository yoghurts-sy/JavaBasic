package Generic;
/*
 * 接口实现类1:第一种方法
 * 直接规定接口的类型
 * 格式：
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
