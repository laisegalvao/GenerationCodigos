package PacoteExercicios5;

import java.util.Scanner;

public class Questao1Vetores {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int soma = 0, media =0, vezes = 0, maiorLance = 0, i;
		int[] lancamento = new int [10]; //pode ser assim tb: int[] lancamento; 
										 // lancamento = new int [10];
		
		
		for (i=0; i<=9; i++)//a cada passagem soma 1..at� chegar em 9.
		{
			System.out.println("Entre com o n�mero do lan�amento (de 1 a 6): " + i+ 1 + ":" );
			lancamento[i] = ler.nextInt();
			soma = lancamento[i] + soma;
			
			if(lancamento[i] <=0  || lancamento[i] > 6)
				System.out.println("O n�mero digitado n�o est� dentre os n�meros apresentados em um dado comum!"
						+ "Digite entre 1 e 6.");
			if(lancamento[i] > maiorLance)
				maiorLance = lancamento[i];		
		}
		for(i=0; i<=9; i++)
		{
			System.out.println("\nO valor do lan�amento " + i+ 1 + " foi: " + lancamento[i] + ".");
			if(lancamento[i] == maiorLance)
				vezes ++;
		}
		System.out.println("\nA m�dia aritim�tica dos 10 lan�amentos �: " + soma/10 + ".");
		System.out.println("\nO maior valor obtido dentre os 10 lan�amentos foi: " + maiorLance + ".");
		System.out.println("\nA quantidade de vezes que o maior valor obtido apareceu foi: " + vezes + " vez(es).");
	}

}
