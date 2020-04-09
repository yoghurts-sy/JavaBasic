package com.Java.Generic;
/*
 * 先规定泛型
 */
public class TestInterfaceImp1 {
	public static void main(String[] args) {
		InterfaceImp1 imp1 = new InterfaceImp1(); 
		imp1.method("123asd");
		String msg = imp1.get("qwe123");
		System.out.println(msg);
	}
}
