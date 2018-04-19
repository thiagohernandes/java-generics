package com.br.generics;

public class GenericOne<T> { 
	
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public Object get() {
		return t;
	}
	
}
