package PacoteExercicios6;

public class Vendedor extends Pessoa{
	
	private double valorVenda;
	private double comissao;
	
	public Vendedor() {
	}
	
	public Vendedor(String nome, String endereco, String telefone,double valorVenda, double comissao) {
		super(nome, endereco, telefone);
		this.valorVenda = valorVenda;
		this.comissao = comissao;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Vendedor [valorVenda=" + valorVenda + ", comissao=" + comissao + "]" + "\n";
	}
		
}
