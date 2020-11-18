package PacoteExercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Questao5_Condicionais {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		//ler.useLocale(Locale.US);
		float indiceP;
		
		System.out.printf("Entre com índice de poluição: ");
		indiceP = ler.nextFloat();
		
		if(indiceP> 0.3 && indiceP < 0.4)
		{
			System.out.printf("O grupo 1 está intimado para suspensão das atividades!");	
		}
		else if(indiceP >= 0.4 && indiceP<0.5)
		{
			System.out.printf("Os grupo 1 e grupo 2 estão intimados para suspensão das atividades!");
		}
		else if(indiceP >=0.5)
		{
			System.out.printf("Todos os grupos estão intimados para suspensão das atividades!");
		}
		else if(indiceP>= 0.05 && indiceP<=0.25)
		{
			System.out.printf("Os índices estão dentro dos padõres aceitáveis.");
		}
		else
		{
			System.out.printf("Índíces não encontrados.");
		}
	}

}
