package POO;

public class Nome {
	
	public static void main(String []args)
	{//aqui dentro vai executar a classe anterior(Pessoa)
		Pessoa pessoa1 = new Pessoa ("Maria", "Antonia", "Oliveira.");
//criou o novo obejto(pessoa1), instaciou do t�po Pessoa por meio do new
//dentro () � onde est� sendo passado os par�metros (que na classe Pessoa foi colocado: primeiro, ultimo..
		System.out.println(pessoa1.getNomeCompleto());
 	}
//O System... � para visualizar a informa��o. pessoa1 (novo objeto) . (o ponto vai chamar o get que foi
//o m�todo criado l� na classe Pessoa.
}
