package com.dio;

import com.dio.model.Cat;

public class PrimeiroPrograma {

    public static void main(String[] args) {
    	
    	Cat cat = new Cat(); 
    	Livros livros = new Livros();
    	
    	System.out.println(cat);
    	System.out.println(livros);
    }

}

class Livros {
	private String nome;
	private String npag;
}