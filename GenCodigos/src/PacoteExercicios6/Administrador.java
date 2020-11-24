package PacoteExercicios6;

public class Administrador extends Pessoa {
	
	private double ajudaDeCusto;
	

	public Administrador() {
		super();
	}
	
	public Administrador(String nome, String endereco, String telefone, double ajudaDeCusto) {
		super(nome, endereco, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public String toString() {
		return "Administrador [ajudaDeCusto=" + ajudaDeCusto + "]" + "\n";
	}	
	
}
