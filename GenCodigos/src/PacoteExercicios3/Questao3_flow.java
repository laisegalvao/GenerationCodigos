package PacoteExercicios3;

import java.util.Scanner;

public class Questao3_flow {
//As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, 
//e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia 
//o número de maçãs compradas, calcule e escreva o valor total da compra.

	public static void main(String[]args)
	{
		Scanner ler = new Scanner(System.in);
		int totalm;
		float valor1,valor2;
		
		System.out.println("Entre com o número de maçãs compradas: ");
		totalm = ler.nextInt();
		
		if(totalm <12)
		{
			valor1 = (float) (totalm * 0.30);
			System.out.println("O número de maçã(s) comprada(s) foi: " + totalm + 
					" e o valor total da compra é R$" + valor1 + ".");
		}
		else if(totalm >= 12)
		{
			valor2 = (float) (totalm * 0.25);
			System.out.println("O número de maçã(s) comprada(s) foi: " + totalm + 
					" e o valor total da compra é R$" + valor2 + ".");
		}
	}
}
