package POO;

public class Nome {
	
	public static void main(String []args)
	{//aqui dentro vai executar a classe anterior(Pessoa)
		Pessoa pessoa1 = new Pessoa ("Maria", "Antonia", "Oliveira.");
//criou o novo obejto(pessoa1), instaciou do típo Pessoa por meio do new
//dentro () é onde está sendo passado os parâmetros (que na classe Pessoa foi colocado: primeiro, ultimo..
		System.out.println(pessoa1.getNomeCompleto());
 	}
//O System... é para visualizar a informação. pessoa1 (novo objeto) . (o ponto vai chamar o get que foi
//o método criado lá na classe Pessoa.
}
