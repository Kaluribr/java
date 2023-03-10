package aula_06;

public abstract class Farmacia {
	// Nao tem main porque vai definir um modelo de dados

	private long id; // private porque ira encapcular
	private String nome; // String com S maiusculo porque e uma classe (objeto)
	private String nomeComercial;
	private String fabricante;
	private String foto;
	private float preco;
	private int tipo;

	public Farmacia(long id, String nome, String nomeComercial, String fabrivante, String foto, float preco, int tipo) {
		this.id = id;
		this.nome = nome;
		this.nomeComercial = nomeComercial;
		this.fabricante = fabrivante;
		this.foto = foto;
		this.preco = preco;
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	public String getFabrivante() {
		return fabricante;
	}

	public void setFabrivante(String fabrivante) {
		this.fabricante = fabrivante;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public abstract void reajuste(float percentual);

	public void visualizar() {
		
		String tipo = "";
		
		switch(this.tipo) {
		case 1 -> tipo = "Medicamento";
		case 2 -> tipo = "Perfumaria";
		}
		
 		System.out.println("*****************************************");
 		System.out.println("           Dados do Produto              ");
 		System.out.println("*****************************************");
 		System.out.println("\nId: " + this.id); 		
 		System.out.println("\nNome: " + this.nome);
 		System.out.println("\nNome Comercial: " + this.nomeComercial);
 		System.out.println("\nFbricnte: " + this.fabricante);
 		System.out.println("\nFoto: " + this.foto);
 		System.out.println("\nPreco: " + this.preco);
 		System.out.println("\nCategotia: " + tipo);
 		
 	}

}
