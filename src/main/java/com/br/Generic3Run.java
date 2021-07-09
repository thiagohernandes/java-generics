package com.br;

import com.br.generics.Generic3;

public class Generic3Run {

	public static void main(String...args) {
		Integer[] valores = {1,2,3,4,5,6};
		Generic3<Integer> numeros = new Generic3<>(valores);
		System.out.println(numeros.averageFunc());
	}
}
