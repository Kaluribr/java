package cliente;

public class Cliente {
	
	private String nome;
	private int numero;
	private String endereco;
	private float credito;
	private float saldo;
	
	public Cliente(String nome, int numero, String endereco, float credito, float saldo) {
		super();
		this.nome = nome;
		this.numero = numero;
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
	
	public void visualizar() {
		
		System.out.println("***********************************");
		System.out.println("         DADOS DO CLIENTE          ");
		System.out.println("***********************************");
		System.out.println("Nome do Cliente: " + nome);
		System.out.println("Numero do Cliente: " + numero);
		System.out.println("Endereço do Cliente: " + endereco);
		System.out.println("Credito do Cliente: " + credito);
		System.out.println("Saldo do Cliente: " + saldo);
		
	}
	
}
