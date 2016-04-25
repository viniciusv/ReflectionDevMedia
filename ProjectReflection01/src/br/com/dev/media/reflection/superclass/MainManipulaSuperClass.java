package br.com.dev.media.reflection.superclass;

import java.lang.reflect.InvocationTargetException;

public class MainManipulaSuperClass {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException {
		
		ClienteAssociado associado = new ClienteAssociado(19);
		System.out.println("Idade do cliente: " + associado.getIdade());
		Class classe = associado.getClass();
		
		while (true) {
			if(classe.getSuperclass().equals(Object.class)){
				break;
			}
			classe = classe.getSuperclass();
		}
		
		System.out.println(classe.getSimpleName());
		Object value = classe.getDeclaredMethod("getIdade", new Class[0]).invoke(classe.newInstance(), new Object[0]);
		System.out.println("Idade verdadeira " + value);

	}

}
