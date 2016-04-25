package br.com.dev.media.reflection.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class MainManipulaConstructor {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Class classe = Pessoa.class;
		
		//classe.getConstructors - construtores que sao publicos
		Constructor[] construtores = classe.getConstructors();
		System.out.println("Construtores encontrados: " + construtores.length);
		//classe.getDeclaredConstructors - mostra todos os construtores da classe msm sendo private 
		construtores = classe.getDeclaredConstructors();
		System.out.println("Construtores encontrados: " + construtores.length);
		
		instanceClassByConstructor(classe.getDeclaredConstructor(new Class[]{String.class}));
	}

	private static void instanceClassByConstructor(Constructor declaredConstructor) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		if(Modifier.isPrivate(declaredConstructor.getModifiers())){
			declaredConstructor.setAccessible(true);
		}
		
		Object obj = declaredConstructor.newInstance(new Object[]{"teste"});
		Pessoa pessoa = (Pessoa) obj;
		System.out.println("Nome recebido pelo construtor via reflexao " + pessoa.getNome());
	}

}
