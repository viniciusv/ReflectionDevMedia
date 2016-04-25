package br.com.dev.media.reflection.superclass;

import br.com.dev.media.reflection.constructor.Pessoa;

public class Cliente extends Pessoa {

	public Cliente(Integer idade) {
		super(idade);
	
	}

	@Override
	public Integer getIdade() {
		System.out.println("Recuperando idade FAKE");
		return 14;
	}
	
}
