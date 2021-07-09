package com.br;

import com.br.generics.Generic2;

public class Generic2Run {

	public static void main(String...$$) {
		Generic2<Integer, String> tobj = new Generic2<Integer, String>(1,"um");
		tobj.showTypes();
		System.out.println(tobj.getObj1());
		System.out.println(tobj.getObj2());
	}
}
