package List;
/*
 * hashCode哈希值是一个十进制的 整数，由系统随机给出（是对象的一个逻辑地址，是模拟出来的地址，不是实际的物理地址）
 * 由Object类的一个方法，可以获取对象的哈希值
 * int hashCode() 返回该对象的哈希值
 * hashCode 的源码为：
 * 		public native int hashCode();
 * 		native表示通过jvm在调用本地系统
 * 
 */
public class DemoSet_HashSet_hashCode {

	public static void main(String[] args) {
		DemoSet_HashSet_hashCode_Person p1 = new DemoSet_HashSet_hashCode_Person();
		int h1 = p1.hashCode();
		System.out.println(h1);
		
		DemoSet_HashSet_hashCode_Person p2 = new DemoSet_HashSet_hashCode_Person();
		int h2 = p2.hashCode();
		System.out.println(h2);
		
		/*实际地址*/
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1 == p2);/*虽然hashCode都是1，但是物理地址不一样*/
		/* toString的源码：也是使用了hashCode
		 * return getClass().getName() + "@" + Integer.toHexString(hashCode());
		 * Object也重写了hashCode方法
		 */
		String s1 = new String("abd");
		String s2 = new String("abd");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("重地".hashCode());
		System.out.println("通话".hashCode());
	}

}
