package POO;

public class Carro {
//cria��o de atributos:
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
//cria��o de m�todos:	
	void liga()
	{
		System.out.println("O carro est� ligado."); 
//como s� tem a indica��o de uma frase n�o vai precisar retornar nada. N�o tem parametro no liga()
	}
	void acelera(double quantidade)// passou o parametro double com vari�vel quantidade
	{
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova; //velcNova � uma vari�vel q foi criada localmente.
//criou uma variavel VelocidaeNova pq quando acionar o m�todo acelera ele vai criar uma veloc nova
//vai passar uma quantidade nova de velocidade. O this. � pra procurar qual � o atributo + a quantidade
//que o parametro que vai passar pra esse m�todo..
	}
	int pegaMarcha()
	{// n vai passar nenhum parametro, mas ele vai verificar atrav�s de um la�o condicional se a 
//velocidade atual est� menor que zero ou se est� entre zero e menor que 40 e etc..
		if(this.velocidadeAtual < 0)
		{
			return  -1;
		}
		if(this.velocidadeAtual>=0 && this.velocidadeAtual<40)
		{
			return 1;
		}
		if(this.velocidadeAtual>= 40 && this.velocidadeAtual<80)
		{
			return 2;
		}
		return 3;
	}
// feito tudo isso vai criar um teste pra verificar esses m�todos criados. Vou criar outra classe (TesteCarro).
}
