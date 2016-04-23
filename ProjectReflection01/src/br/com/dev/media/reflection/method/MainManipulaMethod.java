package br.com.dev.media.reflection.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainManipulaMethod {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class classe = Class.forName("br.com.dev.media.reflection.method.Loja");
		
		Method[] metodos = classe.getMethods();
		//getMethods() - retornar a quantidade de metodos da classe e da sua classe pai 
		System.out.println("Quantidade de Metodos " + metodos.length);
		
		//getDeclaredMethods() - retornar a quantidade de metodos da classe
		metodos = classe.getDeclaredMethods();
		System.out.println("Quantidade de Metodos " + metodos.length);
		
		Object objLoja = classe.newInstance();
		setAtributesViaMethod(metodos, objLoja);
		System.out.println("Mostrando os valores sem reflexao");
		System.out.println(objLoja);
		System.out.println("Mostrando os valores com reflexao");		
		showAtributesViaMethod(metodos, objLoja);
		
	}

	private static void showAtributesViaMethod(Method[] metodos, Object objLoja) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (Method metodo : metodos){
			if(Modifier.isPrivate(metodo.getModifiers())){
				metodo.setAccessible(true);
			}
			if(metodo.getName().contains("get")){
				System.out.println(metodo.getName() + " Valor:" + 
			metodo.invoke(objLoja, new Object[0]) );
			}
			if(metodo.getName().contains("is")){
				System.out.println(metodo.getName() + " Valor:" + 
			metodo.invoke(objLoja, new Object[0]) );
			}
		}
	}

	private static void setAtributesViaMethod(Method[] metodos, Object objLoja) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (Method metodo : metodos){
			if(Modifier.isPrivate(metodo.getModifiers())){
				metodo.setAccessible(true);
			}
			if(metodo.getName().contains("set")){
				if(metodo.getName().equals("setNome")){
					metodo.invoke(objLoja, new Object[]{"Posto estrela"});
				}
				if(metodo.getName().equals("setCnpj")){
					metodo.invoke(objLoja, new Object[]{123456987123L});
				}
				if(metodo.getName().equals("setTipo")){
					metodo.invoke(objLoja, new Object[]{"Postos de combustiveis"});
				}
				if(metodo.getName().equals("setMatriz")){
					metodo.invoke(objLoja, new Object[]{true});
				}
			}
		}
	}

}
