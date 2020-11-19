package POO;

public class Carro {
//criou um carro e vai dar alguns m�todos que ser�o manipulados atrav�s dos seus atributos.
	
	String cor;
	String modelo;               //4 atributos da classe CARRO.
	double velocidadeAtual;
	double velocidadeMaxima;
	
	//cria��o dos m�todos:
	
	void liga() //esse m�todo vai indicar q o carro est� ligado quando ele for chamado.
	{
		System.out.println("O carro est� ligado.");
	//como aqui s� tem uma indica��o de uma frase, n est� retornando nenhum conte�do.
	}
	void acelera(double quantidade)  //passou o parametro(double..)
	{
		double velocidadeNova = this.velocidadeAtual+quantidade;   //pq quando acionar o m�todo acelera ele vai criar uma
		//velocidade nova de velocidade
		this.velocidadeAtual = velocidadeNova;
		//atributo this, que � da classe principal
	}
	int pegaMarcha()
	{
		if(this.velocidadeAtual<0)
		{
			return -1;
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
	
}
