package PacoteExercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Questao5_Condicionais {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		//ler.useLocale(Locale.US);
		float indiceP;
		
		System.out.printf("Entre com �ndice de polui��o: ");
		indiceP = ler.nextFloat();
		
		if(indiceP> 0.3 && indiceP < 0.4)
		{
			System.out.printf("O grupo 1 est� intimado para suspens�o das atividades!");	
		}
		else if(indiceP >= 0.4 && indiceP<0.5)
		{
			System.out.printf("Os grupo 1 e grupo 2 est�o intimados para suspens�o das atividades!");
		}
		else if(indiceP >=0.5)
		{
			System.out.printf("Todos os grupos est�o intimados para suspens�o das atividades!");
		}
		else if(indiceP>= 0.05 && indiceP<=0.25)
		{
			System.out.printf("Os �ndices est�o dentro dos pad�res aceit�veis.");
		}
		else
		{
			System.out.printf("�nd�ces n�o encontrados.");
		}
	}

}
