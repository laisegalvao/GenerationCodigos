package PacoteExercicios3;

import java.util.Scanner;

public class Questao6_flow {
//Quest�o:Escreva um programa para ler 3 valores inteiros e escrever o maior deles. 
//Considere que o usu�rio n�o informar� valores iguais.
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int n1, n2,n3;
		
		System.out.println("Entre com o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.println("Entre com o segundo valor: ");
		n2 = ler.nextInt();
		
		System.out.println("Entre com o terceiro valor: ");
		n3 = ler.nextInt();
		
		if(n1==n2 && n1==n3 && n2==n3)
		{
			System.out.println("\nValores id�nticos!Encerrar programa.");
		}
		else if(n1 > n2 && n2 > n3)
		{
			System.out.println("\nO maior valor dentre os 3 lidos �: " + n1 +".");
		}
		else if(n2>n1 && n1>n3)
		{
			System.out.println("\nO maior valor dentre os 3 lidos �: " + n2 + ".");
		}
		else
		{
			System.out.println("\nO maior valor dentre os 3 lidos �: " + n3 + ".");
		}
	}

}
