package POO;

public class TesteCarro {
	
	public static void main(String[]args)
	{
		Carro meuCarro = new Carro();
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Passat";     //todos os atributos.
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		//MeuCarro é um novo objeto do tipo Carro e instanciou todos os atributos.
		
		//chamando os métodos:
		meuCarro.liga();
		
		meuCarro.acelera(20); //20km/h
		System.out.println(meuCarro.velocidadeAtual);
		
	}

}
