package PacoteExercicios6;

public class main {

	public static void main(String[] args)
	{
		Pessoa pessoa  = new Pessoa("Jessica.", "Rua 41. SP", "5555-7441");
		Fornecedor fornecedor = new Fornecedor ("Luiz.", "Av. 17 de Agosto.PE", "3333-8741", 
				500.70, 400, 800);
		Empregado empregado = new Empregado("Maria","Rua das Dores. Campinas", "7771-8741",
				111, 3000, 0.11);
		Operario operario = new Operario ("Carlos", "Av. Pio XII. AL", "1111-7571", 1.000, 400.00);
		Administrador administrador = new Administrador ("Ana", "Travessa XI. BA", "8887-3214",
				300.00);
		
		System.out.println(pessoa.toString());
		System.out.println(fornecedor.toString());
		System.out.println(empregado.toString());
		System.out.println(operario.toString());
		System.out.println(administrador.toString());
	}
}
