package com.br.generics;

public class Generic3<T extends Number> {

	T[] num;
	
	public Generic3(T[] o){
		num = o;
	}
	
	public int averageFunc() {
		int soma = 0;
		for(int x = 0; x < num.length; x++) {
			soma+=num[x].intValue();
		}
		return soma;
	}
	
}
