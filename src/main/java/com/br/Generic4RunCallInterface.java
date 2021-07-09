package com.br;

import com.br.interfaces.GenericInterface;
import com.br.interfaces.GenericInterfaceImpl;

public class Generic4RunCallInterface {
	
	public static void main(String...args) {
		GenericInterface teste = new GenericInterfaceImpl<Pessoa>();
		Pessoa p = (Pessoa)teste.getObj(new Pessoa(33,"Fulano"));
		System.out.println(p.getNome());
		
		GenericInterface teste2 = new GenericInterfaceImpl<Carro>();
		Carro c = (Carro)teste.getObj(new Carro(2016,"Audi A3"));
		System.out.print(c.getModelo());
	}

}
