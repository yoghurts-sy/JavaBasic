package com.Java.Generic;
/*
 * ²âÊÔ·ºĞÍµÄÀà
 */
public class TestGenericClass {
	public static void main(String[] args) {
		GenericClass<String> gc = new GenericClass<>();
		gc.setName("123");
		
		System.out.println(gc.getName());
	}
}
