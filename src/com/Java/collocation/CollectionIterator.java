package com.Java.collocation;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

/*`Iterator`��Ҫ���ڵ������ʣ���������`Collection`�е�Ԫ��
 * ���`Iterator`����Ҳ����Ϊ������
 * 
 * Iterator�ӿڵĳ��÷������£�
 *
 * `public E next()`:���ص�������һ��Ԫ�ء�
 * `public boolean hasNext()`:�������Ԫ�ؿ��Ե������򷵻� true��
 */

/*
 * ������ԭ��
 * �ڵ���Iterator��next����֮ǰ��������������λָ���һ��Ԫ��֮ǰ
 * ������һ��nextʱ���������������������һλ���Դ����ƣ��ﵽ����ĩβ��
 * �������Ѿ�ָ���β����ʹ��next�ᱨ��NoSuchElementException
 */
public class CollectionIterator {
		public static void main(String[] args) {
			/*
			 * ʹ�ö�̬��������
			 */
			Collection<String> coll = new ArrayList<String>();
			
			coll.add("����");
			coll.add("���ҵļ���");
			coll.add("�����̳ǵ�����");
			
			Iterator<String> it = coll.iterator();
			
			while (it.hasNext()) {
				String msg = it.next();
				System.out.println(msg);
			}
			
			/*System.out.println(it.next());*/
		}
}
