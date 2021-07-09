package com.br;

import java.util.HashMap;
import java.util.Map;

import com.br.generics.Generic1;

public class Generic1Run {

	public static void main(String...strings) {
		
		Generic1<String> stringGeneric = new Generic1<>();
		Generic1<Integer> integerGeneric = new Generic1<>();
		Generic1<Map<String,String>> mapGeneric = new Generic1<>();
		
		stringGeneric.set("Olá");
		integerGeneric.set(9000);
		Map<String,String> mapTeste = new HashMap<>();
		mapTeste.put("msg", "Mensagem! Deus é fiel!");
		mapGeneric.set(mapTeste);
		
		System.out.println(stringGeneric.get());
		System.out.println(integerGeneric.get());
		System.out.println(mapTeste.get("msg"));
	}
	
}
