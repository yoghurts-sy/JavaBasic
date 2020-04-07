package com.Java.Generic;

/*
 * 定义一个含有泛型的类，可以接受任何类型的数据类型
 * 创建对象时可以使用泛型的数据类型
 */
public class GenericClass<E> {
	private E name;

	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}
	
	
}
