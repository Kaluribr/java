package mtransporte;
//classe terrestre herda a classe transporte com EXTANDS
public class Terrestre extends Transporte {
	
	private int nRodas;
	private float velocidade;
	
	public Terrestre(int capacidade, int nRodas, float velocidade) {
		super(capacidade);
		this.nRodas = nRodas;
		this.velocidade = velocidade;
	}

	public int getnRodas() {
		return nRodas;
	}

	public void setnRodas(int nRodas) {
		this.nRodas = nRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	public void visualizar() {//Para vizualizar e nescessario usar o polimorfismo, para usar uma sobreescrita do metodo.
		super.visualizar();
		System.out.println("Numero de Rodas: " + this.nRodas);
		System.out.println("Velocidade: " + this.velocidade);
	}
}
