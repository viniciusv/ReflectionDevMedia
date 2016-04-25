package br.com.dev.media.reflection.superclass;

public class ClienteAssociado extends Cliente {

	public ClienteAssociado(Integer idade) {
		super(idade);
	
	}

	@Override
	public Integer getIdade() {
		System.out.println("Recuperando a idade");
		return super.getIdade();
	}
	
}
