package POO;

public class Pessoa { //criou classe chamada Pessoa
//1�passo: come�ar a dar os atributos para a classe Pessoa. 
//Oa artibutos ser�o privado(tipo private) p dar seguran�a, p que outras classes n acessem.
//Como os atributos criados s�o private so a classe Pessoa q pode acess�-los.
	
	private String primeiroNome; //primeiroNome � atributo de PEssoa..
	private String ultimoNome; // criamos 3 atributos p Pessoa..
	private String NomesDoMeio;
	
	// depois da cria��o dos atributos, ser� criado um Construtor! Como s�o privados, o construtor
	//permitir� que sejam ultizados outros m�todos nos atributos. Construtor sempre carrega o mesmo nome
	//da classe.
	
	public Pessoa (String primeiro, String meio, String ultimo) //o que est� entre () s�o os argumentos
	//os argumentos sao os 3 atributos que tem, mas com os outros nomes que o est�o representando..
	{ //dentro das chaves vai come�ar a atribuir cada argumento aos atributos, ent�o:
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
	//do modo que est� at� "return" n�o consegue visualizar NADA, ent�o tem criar o main (principal)
	//para poder chamar esses atributos e poder jogar da visualiza��o. Vai come�ar a instanciar
	//o novo objeto, ai cria outra classe..(crie o Nome da nova classe).
}
