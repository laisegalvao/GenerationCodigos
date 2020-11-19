package POO;

public class Pessoa { 
	
	private String primeiroNome;     // private(segurança) p que outras classes n possam manipulá-los.
	private String ultimoNome;      // primeiroNome, nomesdomeio...são os ATRIBUTOS.
	private String nomesdoMeio;
	
	//criar o construtor dos atributos, tem que fazer isso pq os atributos estão sendo privados.
	//então apenas os métodos da classe Pessoa q vai poder acessar esses atributos. E para poder
	//torná-los acessíveis p outros métodos se faz através do construtor.* construtor sempre carrega
	//o mesmo nome da classe:
	
	public Pessoa (String primeiro, String meio, String ultimo)// vai passar como argumento os três tributos que tem!
	{ //public indica q o construtor é púbilco e pode ser invocado por qlq classe 
		primeiroNome = primeiro; //associando cada argumento aos atributos.
		ultimoNome = ultimo;
		nomesdoMeio = meio;
	//os construtores não criam e nem retornam objetos. Quem faz isso é o new.
	}
	 //criação de um método para juntar os 3 nomes:
	
	public String getNomeCompleto()
	{
		String NomeCompleto = primeiroNome + " " + nomesdoMeio + " " + ultimoNome; //variável local do tipo String
		return NomeCompleto; //p poder retornar o nome completo do usuário 
	}
	
}
