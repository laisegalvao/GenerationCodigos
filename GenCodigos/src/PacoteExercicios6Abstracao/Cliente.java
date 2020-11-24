package PacoteExercicios6Abstracao;

public class Cliente {
	
	private String nome;
	private String idade;
	private String conta;
	
	public Cliente(String primeiroNome, String anos, String tipo){
		
		nome = primeiroNome;
		idade = anos;
		conta = tipo;	
	}
	
	public String getDadosdoCliente(){
		
		String DadosdoCliente = "O nome do cliente é: " + nome + " Sua idade: " + idade + " E sua conta: " +
								conta;
		return DadosdoCliente;
	}

}
