package com.br;

import java.util.HashMap;
import java.util.Map;

import com.br.generics.GenericOne;

public class GenericOneRun {

	public static void main(String...strings) {
		
		GenericOne<String> stringGeneric = new GenericOne<>();
		GenericOne<Integer> integerGeneric = new GenericOne<>();
		GenericOne<Map<String,String>> mapGeneric = new GenericOne<>();
		
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
