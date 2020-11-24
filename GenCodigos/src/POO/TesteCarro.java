package POO;

public class TesteCarro {
	public static void main(String []args)
	{
		Carro meuCarro = new Carro();
//agora vai colocar algumas características do carro (q foram feitas lá na classe Carro:
		meuCarro.cor = "Vermelho.";
		meuCarro.modelo = "Passat.";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
//criou um novo objeto do tipo Carro e instanciou todos os atributos.

//Agora vai chamar os métodos:
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);//chamou velocidadeAtual p verificar se houve modificação.
	}

}
