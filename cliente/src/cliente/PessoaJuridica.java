package cliente;

public class PessoaJuridica extends Cliente {
	
	private long cnpj;
	private String NomEmpresa;

	public PessoaJuridica(String nome, int numero, String endereco, float credito, float saldo, long cnpj, String NomEmpresa) {
		super(nome, numero, endereco, credito, saldo);
		this.cnpj = cnpj;
		this.setNomEmpresa(NomEmpresa);
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomEmpresa() {
		return NomEmpresa;
	}

	public void setNomEmpresa(String nomEmpresa) {
		NomEmpresa = nomEmpresa;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Cliente CNPJ: " + this.cnpj);
		System.out.println("Nome da Empresa do Cliente: " + this.NomEmpresa);
	}
	
}
