package com.Java.Generic;
/*
 * 含有泛型的接口
 * 注意使用抽象方法 or 不带public 和  abstract
 */
public interface  GenericInterface<E> {
		public abstract void method(E e);
		
		public abstract E get(E e);

}