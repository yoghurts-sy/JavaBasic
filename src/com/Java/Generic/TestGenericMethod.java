package com.Java.Generic;

public class TestGenericMethod {

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		
		gm.method(1);
		gm.method("123");
		gm.method(true);
		
		gm.method02("��̬����");
		gm.method02(123);
	}

}
