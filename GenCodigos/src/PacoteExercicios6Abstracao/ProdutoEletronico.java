package PacoteExercicios6Abstracao;

public class ProdutoEletronico {
	
	private String marca;
	private double valor;
	private double potencia;
	

	public ProdutoEletronico(String marca, double valor, double potencia) {
		super();
		this.marca = marca;
		this.valor = valor;
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "ProdutoEletronico [marca=" + marca + ", valor=" + valor + ", potencia=" + potencia + "]";
	}
		
}
