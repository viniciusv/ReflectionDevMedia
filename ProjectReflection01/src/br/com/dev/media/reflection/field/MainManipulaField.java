package br.com.dev.media.reflection.field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;

public class MainManipulaField {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException{
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("field");
		veiculo.setPeso(550.0);
		veiculo.setPotencia(1.2);
		veiculo.setQuantidadeMaximaPassageiros(5);
		veiculo.setValor(new BigDecimal("20450.0"));
		
		Class classe = veiculo.getClass();
		//getFields vai retornar todos os atributos publicos das nossa glasse e da classe superio tb 
		Field[] atributos = classe.getFields();
		System.out.println("Quantidade de fields: "+ atributos.length);

		//Retorna todos os atributos da classe
		atributos = classe.getDeclaredFields();
		System.out.println("Quantidade de fields: "+atributos.length);
	
		showValuesInFields(atributos, veiculo);
		
		System.out.println("Valor apos o set via reflexao");
		System.out.println("Nova Marcar: " + veiculo.getMarca());
	}

	private static void showValuesInFields(Field[] atributos, Object object) throws IllegalArgumentException, IllegalAccessException {
		
		for (Field atributo : atributos){
			if(Modifier.isPrivate(atributo.getModifiers())){
				atributo.setAccessible(true);
			}
			System.out.println(atributo.getName() + " Valor: "+ atributo.get(object));
			
			if(atributo.getName().equals("marca")){
				atributo.set(object, "GM");
			}
		}
		
	}

}
