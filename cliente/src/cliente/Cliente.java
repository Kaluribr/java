package cliente;

public class Cliente {
	
	private String nome;
	private int numero;
	private int idade;
	private String endereco;
	private float credito;
	private float saldo;
	
	public Cliente(String nome, int numero, String endereco, float credito, float saldo, int idade) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.idade = idade;
		this.endereco = endereco;
		this.credito = credito;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumerp(int numero) {
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito += credito;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void visualizar() {
		
		System.out.println("***********************************");
		System.out.println("         DADOS DO CLIENTE          ");
		System.out.println("***********************************");
		System.out.println("Nome do Cliente: " + nome);
		System.out.println("Idade do Cliente: " + idade);
		System.out.println("Numero do Cliente: " + numero);
		System.out.println("Endereço do Cliente: " + endereco);
		System.out.println("Credito do Cliente: " + credito);
		System.out.println("Saldo do Cliente: " + saldo);
		
	}

	
	
}
