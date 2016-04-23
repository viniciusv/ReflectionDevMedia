package br.com.dev.media.reflection.basic;

public class Pessoa {

	protected static String nome;
	protected Integer idade;
	private String endereco;
	public static Double altura;
	
		
	protected static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public final Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	private String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Pessoa() {
	
	}

}
