package PacoteExercicios3;

import java.util.Scanner;

public class Questao4_flow {
//Escreva um programa para ler o número de lados de um polígono regular e a medida 
//do lado (em cm). Calcular e imprimir o seguinte:
//− Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área 
//− Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
//− Se o número de lados for igual a 5 escrever PENT�?GONO.

	public static void main(String[]args)
	{
		Scanner ler = new Scanner(System.in);
		int lados;
		float l1 =0, areat, areaq;
		
		System.out.println("Entre com o número de lados de um polígono regular: ");
		lados = ler.nextInt();
		
		if(lados ==3)
		{
			System.out.println("Entre com um valor para l1: ");
			l1 = ler.nextInt();
			
			areat = (float) (Math.pow(l1, 2) * Math.sqrt(3)/4);	
			System.out.println("Triângulo com área igual a: " + areat);
		}
		else if(lados == 4)
		{
			System.out.println("Entre com um valor para l1: ");
			l1= ler.nextInt();
	
			areaq = l1 * l1;
			System.out.println("Quadrado com área igual a: " + areaq);	
		}
		else if (lados ==5)
		{
			System.out.println("É um pentágono!");
		}
		else
		{
			System.out.println("Não é um Polígono! Polígono não identificado!"); //Questão 5	
		}
		
	}
}
