package PacoteExercicios6Abstracao;

public class TestaProduto {
	
	public static void main(String [] args)
	{
		ProdutoEletronico produtoE = new ProdutoEletronico("Samsung", 700.00, 80);
		
		produtoE.setMarca("Samsung");
		produtoE.setValor(700.00);
		produtoE.setPotencia(80);
		
		System.out.println(produtoE.toString());
		
	}

	
}
