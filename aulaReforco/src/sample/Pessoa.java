package sample;

public class Pessoa {
	
	public String nome;
	public int idade;
	
	public Pessoa( int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
