
public class Automovel {
	//declarar os atributos de clsse
	private String nomeProprietario;
	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	
	//criar um metodo construtor
	public Automovel(String nomeProprietario, String marca, String modelo, String placa, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	// declarar os demais metodos da nossa classe
	
	public void impriInfo() {
		System.out.println("/n" + nomeProprietario + " possui um " + modelo + " da marca " + marca + " e placa " + placa + " do ano " + ano);
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
