package Collection;

import java.util.ArrayList;
import java.util.Collection;


	/* ���Ϻ������Ȼ����������������ɶ�����أ�
	 * ����ĳ����ǹ̶��ġ����ϵĳ����ǿɱ��
	 * �����д洢����ͬһ���͵�Ԫ�أ����Դ洢������������ֵ��
	 * ���ϴ洢�Ķ��Ƕ��󡣶��Ҷ�������Ϳ��Բ�һ�¡�
	 * 
	 * Collection ���ù��� �����
	 * 
	 * `public boolean add(E e)`��  �Ѹ����Ķ�����ӵ���ǰ������ ��
	 * `public void clear()` :��ռ��������е�Ԫ�ء�
	 * `public boolean remove(E e)`: �Ѹ����Ķ����ڵ�ǰ������ɾ����
	 * `public boolean contains(E e)`: �жϵ�ǰ�������Ƿ���������Ķ���
	 * `public boolean isEmpty()`: �жϵ�ǰ�����Ƿ�Ϊ�ա�
	 * `public int size()`: ���ؼ�����Ԫ�صĸ�����
	 * `public Object[] toArray()`: �Ѽ����е�Ԫ�أ��洢�������С�
	 * 
	 * 
	 */

public class CollectionInterface {
		public static void main(String[] args) {
			/*
			 * ʹ�ö�̬
			 */
			Collection<String> coll = new ArrayList<String>();

			coll.add("�̳�");
			coll.add("���̳�");
			coll.add("����");

			System.out.println(coll);
			
			System.out.println("�����Ƿ����������" + coll.contains("����"));
			
			System.out.println(coll.size());
			
			Object[] objects = coll.toArray();
			for (int i = 0; i < objects.length; i++) {
				System.out.println(objects[i]);
			}
				
			coll.remove("����");
			System.out.println(coll);
			
			coll.clear();
			
			System.out.println("�����Ƿ�Ϊ�գ�" + coll.isEmpty());
		}
}
