package POO;

public class Pessoa { //criou classe chamada Pessoa
//1ºpasso: começar a dar os atributos para a classe Pessoa. 
//Oa artibutos serão privado(tipo private) p dar segurança, p que outras classes n acessem.
//Como os atributos criados são private so a classe Pessoa q pode acessá-los.
	
	private String primeiroNome; //primeiroNome é atributo de PEssoa..
	private String ultimoNome; // criamos 3 atributos p Pessoa..
	private String NomesDoMeio;
	
	// depois da criação dos atributos, será criado um Construtor! Como são privados, o construtor
	//permitirá que sejam ultizados outros métodos nos atributos. Construtor sempre carrega o mesmo nome
	//da classe.
	
	public Pessoa (String primeiro, String meio, String ultimo) //o que está entre () são os argumentos
	//os argumentos sao os 3 atributos que tem, mas com os outros nomes que o estão representando..
	{ //dentro das chaves vai começar a atribuir cada argumento aos atributos, então:
		primeiroNome = primeiro;
		ultimoNome = ultimo; //explicando: atributo UltimoNome recebendo argumento ultimo..
		NomesDoMeio = meio;
	}
	//depois de criado o construtor, vamos criar um METODO para juntar os 3 nomes:
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome + " " + NomesDoMeio + " " + ultimoNome;
		//criou uma String q vai dar o nomecompleto a partir dos 3 atributos 
		return nomeCompleto; //cria o return pra poder retornar (dessa varivael string) o nome completo
	}
	//do modo que está até "return" não consegue visualizar NADA, então tem criar o main (principal)
	//para poder chamar esses atributos e poder jogar da visualização. Vai começar a instanciar
	//o novo objeto, ai cria outra classe..(crie o Nome da nova classe).
}
