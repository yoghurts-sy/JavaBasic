package List;
/*
 * hashCode��ϣֵ��һ��ʮ���Ƶ� ��������ϵͳ����������Ƕ����һ���߼���ַ����ģ������ĵ�ַ������ʵ�ʵ������ַ��
 * ��Object���һ�����������Ի�ȡ����Ĺ�ϣֵ
 * int hashCode() ���ظö���Ĺ�ϣֵ
 * hashCode ��Դ��Ϊ��
 * 		public native int hashCode();
 * 		native��ʾͨ��jvm�ڵ��ñ���ϵͳ
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
		
		/*ʵ�ʵ�ַ*/
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1 == p2);/*��ȻhashCode����1�����������ַ��һ��*/
		/* toString��Դ�룺Ҳ��ʹ����hashCode
		 * return getClass().getName() + "@" + Integer.toHexString(hashCode());
		 * ObjectҲ��д��hashCode����
		 */
		String s1 = new String("abd");
		String s2 = new String("abd");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("�ص�".hashCode());
		System.out.println("ͨ��".hashCode());
	}

}
