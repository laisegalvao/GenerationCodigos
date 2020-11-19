package POO;

public class Pessoa { 
	
	private String primeiroNome;     // private(seguran�a) p que outras classes n possam manipul�-los.
	private String ultimoNome;      // primeiroNome, nomesdomeio...s�o os ATRIBUTOS.
	private String nomesdoMeio;
	
	//criar o construtor dos atributos, tem que fazer isso pq os atributos est�o sendo privados.
	//ent�o apenas os m�todos da classe Pessoa q vai poder acessar esses atributos. E para poder
	//torn�-los acess�veis p outros m�todos se faz atrav�s do construtor.* construtor sempre carrega
	//o mesmo nome da classe:
	
	public Pessoa (String primeiro, String meio, String ultimo)// vai passar como argumento os tr�s tributos que tem!
	{ //public indica q o construtor � p�bilco e pode ser invocado por qlq classe 
		primeiroNome = primeiro; //associando cada argumento aos atributos.
		ultimoNome = ultimo;
		nomesdoMeio = meio;
	//os construtores n�o criam e nem retornam objetos. Quem faz isso � o new.
	}
	 //cria��o de um m�todo para juntar os 3 nomes:
	
	public String getNomeCompleto()
	{
		String NomeCompleto = primeiroNome + " " + nomesdoMeio + " " + ultimoNome; //vari�vel local do tipo String
		return NomeCompleto; //p poder retornar o nome completo do usu�rio 
	}
	
}
