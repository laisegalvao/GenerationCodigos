package PacoteExercicios4;

import java.util.Scanner;

public class Questao8_While {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int total = 0;
		float numero = 0, soma = 0, media = 0;
		
		
		while(numero >= 0)
		{
			System.out.println("Digite aqui valores n�mericos: ");
			numero = ler.nextInt();	
			if (numero > 0)	
			{
				soma = soma + numero;
				total = total + 1;					
			}		
		}
		media = soma / total;
		System.out.println("A soma dos n�meros adicionados �: " + soma + ".");
		System.out.println("A m�dia dos n�meros adicionados �: " + media + ".");
		System.out.println("O total de n�meros adicionados �: " + soma + ".");
	}
}
