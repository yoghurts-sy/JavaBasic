package com.Java.Generic;
/*
 * δ���巺��
 * ��������ƽ���õļ���֮���
 */
public class TestInterfaceImp2 {
	public static void main(String[] args) {
		InterfaceImp2<Integer> imp = new InterfaceImp2();
		imp.method(123);
		
		InterfaceImp2<String>  imp2 = new InterfaceImp2();
		imp2.method("qwe123");

		InterfaceImp2<Double> imp3 = new InterfaceImp2();
		Double ken = imp3.get(0.88);
		System.out.println(ken);
		
	}
}
