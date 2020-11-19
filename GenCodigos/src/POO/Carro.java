package POO;

public class Carro {
//criou um carro e vai dar alguns métodos que serão manipulados através dos seus atributos.
	
	String cor;
	String modelo;               //4 atributos da classe CARRO.
	double velocidadeAtual;
	double velocidadeMaxima;
	
	//criação dos métodos:
	
	void liga() //esse método vai indicar q o carro está ligado quando ele for chamado.
	{
		System.out.println("O carro está ligado.");
	//como aqui só tem uma indicação de uma frase, n está retornando nenhum conteúdo.
	}
	void acelera(double quantidade)  //passou o parametro(double..)
	{
		double velocidadeNova = this.velocidadeAtual+quantidade;   //pq quando acionar o método acelera ele vai criar uma
		//velocidade nova de velocidade
		this.velocidadeAtual = velocidadeNova;
		//atributo this, que é da classe principal
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
