package PacoteExercicios2;

import java.util.Scanner;

public class Questao8_Condicionais {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		int N;
		
		System.out.printf("Entre com um número inteiro: ");
		N = ler.nextInt();
		
		if (N>100)
		{
			System.out.printf("Valor imprimido: " + N + ".");
			
		}
		else
		{
			N =0;
			System.out.printf("Escreva zero" + ".");
		}
	}

}
