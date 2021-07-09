package com.br.interfaces;

public class GenericInterfaceImpl<T> implements GenericInterface<T>{

	@Override
	public T getObj(T t) {
		return t;
	}

	
	
}
