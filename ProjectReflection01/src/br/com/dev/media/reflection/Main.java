package br.com.dev.media.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) {
		Class classe = Pessoa.class;		
		
		System.out.println("Imprimindo os nomes dos atributos da classe:" + classe.getSimpleName());
		System.out.println("IMprimindo os atributos");
		for (Field atributo : classe.getDeclaredFields()) {
			System.out.println("Nome do atributo:" + atributo.getName());
			System.out.println("com os Modificadores:" + Modifier.toString(atributo.getModifiers()));
		}
		
		System.out.println("IMprimindo os metodos");
		for (Method metodo : classe.getDeclaredMethods()) {
			System.out.println("Nome dos metodos:" + metodo.getName());
			System.out.println("com os Modificadores:" + Modifier.toString(metodo.getModifiers()));			
		}
		
		//class -  representa a classe
		//field - representa os atributos
		//method - representa os metados da classe
		//constructor - representa os construtores
		//modifier - modificadores de acessos
		//package - nossos pacotes 
		//Proxy - Um interceptador.. entre a chama de um metodo e a execucao dele.
	}

}
