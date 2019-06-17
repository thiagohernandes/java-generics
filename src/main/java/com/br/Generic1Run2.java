package com.br;

import com.br.generics.Generic1;

public class Generic1Run2 {

	public static void main(String...strings) {
		
		Generic1<Pessoa> genericObj = new Generic1<>();
		Pessoa p = new Pessoa(1, "Filisbino");
		genericObj.set(p);
		System.out.println(genericObj.get());
		
	}
	
}
