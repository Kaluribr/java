package funcionario;

public class Funcionario {
	private String nome;
	private int numero;
	private float salario;
	
	public Funcionario(String nome, int numero, float salario) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void vizualizar() {
		
		System.out.println("***********************************");
		System.out.println("         DADOS DO FUNCIONARIO      ");
		System.out.println("***********************************");
		System.out.println("Nome do Cliente: " + nome);
		System.out.println("Numero do Cliente: " + numero);
		System.out.println("Endereço do Cliente: " + salario);
	}
	
}
