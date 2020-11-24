package POO;

public class Carro {
//criação de atributos:
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
//criação de métodos:	
	void liga()
	{
		System.out.println("O carro está ligado."); 
//como só tem a indicação de uma frase não vai precisar retornar nada. Não tem parametro no liga()
	}
	void acelera(double quantidade)// passou o parametro double com variável quantidade
	{
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova; //velcNova é uma variável q foi criada localmente.
//criou uma variavel VelocidaeNova pq quando acionar o método acelera ele vai criar uma veloc nova
//vai passar uma quantidade nova de velocidade. O this. é pra procurar qual é o atributo + a quantidade
//que o parametro que vai passar pra esse método..
	}
	int pegaMarcha()
	{// n vai passar nenhum parametro, mas ele vai verificar através de um laço condicional se a 
//velocidade atual está menor que zero ou se está entre zero e menor que 40 e etc..
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
// feito tudo isso vai criar um teste pra verificar esses métodos criados. Vou criar outra classe (TesteCarro).
}
