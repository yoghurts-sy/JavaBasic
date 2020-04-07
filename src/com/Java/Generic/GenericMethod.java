package com.Java.Generic;
/*
 * 含有泛型的方法
 * 泛型定义在修饰符和和返回类型直接
 * 格式：
 * 		修饰符 <泛型> 返回值 方法名(参数列表，使用泛型){
 *  	方法体；
 *      }
 */
public class GenericMethod {
	public <M> void method(M m) {
		System.out.println(m);
	}
	
	public static <S> void method02(S s){
		System.out.println(s);
	}
}
