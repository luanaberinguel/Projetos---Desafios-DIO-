package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		Gato gato = new Gato();
		livro livro = new livro();
		
		System.out.println(gato);
		System.out.println(livro);
		/*int a = 2;
		int b = 3;
    System.out.println("Hello World! " + (a+b));*/
}
	}

class livro{
	private String npag;
	private String nome;
}
