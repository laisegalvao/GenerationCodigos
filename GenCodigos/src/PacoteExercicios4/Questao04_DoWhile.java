package PacoteExercicios4;

import java.util.Scanner;

public class Questao04_DoWhile {
//Crie um programa que leia um número do teclado ate que encontre um numero
//igual a zero. No final, mostre a soma dos numeros digitados.(DO...WHILE)

	
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int numero, soma = 0;
		
		do
		{
			System.out.println("Entre com os números: ");
			numero = ler.nextInt();
			soma = soma + numero;
		}
		while (numero !=0);
		
		System.out.println("A soma de todos os números é: " + soma + ".");	
	}

}

