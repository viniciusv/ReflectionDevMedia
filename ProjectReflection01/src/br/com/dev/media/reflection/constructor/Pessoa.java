package br.com.dev.media.reflection.constructor;

public class Pessoa {
	private String nome;
	private Integer idade;
	private String endereco;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, Integer idade, String endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	private Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	public Pessoa(Integer idade) {
		super();
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
