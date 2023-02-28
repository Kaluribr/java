package cliente;

public class PessoaFisica extends Cliente{
	
	private long cpf;
	
	public PessoaFisica(String nome, int numero, String endereco, float credito, float saldo, long cpf, int idade) {
		super(nome, numero, endereco, credito, saldo, idade);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF do Cliente: " + this.cpf);
	}
}
