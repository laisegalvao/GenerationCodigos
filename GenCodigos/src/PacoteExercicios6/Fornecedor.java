package PacoteExercicios6;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	private double saldo;
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida, double saldo) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.saldo = saldo;	
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void obterSaldo() {
		this.saldo = this.valorCredito - this.valorDivida;
	}

	@Override
	public String toString() {
		return "Fornecedor [valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + ", saldo=" + saldo + "]" + "\n";
	}

	
}
