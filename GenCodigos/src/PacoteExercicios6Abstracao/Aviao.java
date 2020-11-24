package PacoteExercicios6Abstracao;

public class Aviao {
	
	private int quantidadeLugares;
	private double velocidade;
	private String modelo;
	
	//public Aviao() { //1 construtor vazio
		
	//}

	public Aviao(int quantidadeLugares, double velocidade, String modelo) {
		this.quantidadeLugares = quantidadeLugares;
		this.velocidade = velocidade;
		this.modelo = modelo;
	}
		

	public Aviao(int quantidadeLugares, double velocidade) {
		this.quantidadeLugares = quantidadeLugares;
		this.velocidade = velocidade;
	}


	public int getQuantidadeLugares() {
		return quantidadeLugares;
	}

	public void setQuantidadeLugares(int quantidadeLugares) {
		this.quantidadeLugares = quantidadeLugares;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Algumas características do Aviao: [quantidadeLugares=" + quantidadeLugares + ", "
				+ "velocidade=" + velocidade + ", modelo=" + modelo + "]";
	}
}
