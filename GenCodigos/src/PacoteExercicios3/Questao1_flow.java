package PacoteExercicios3;

import java.util.Scanner;

public class Questao1_flow {
	
//Escreva um programa para ler 2 valores (considere que n�o ser�o 
//informados  valores  iguais)  e  escrever  o  maior  deles.
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int x,y;
		
		System.out.println("Entre com o primeiro valor: ");
		x = ler.nextInt();
		
		System.out.println("Entre com o segundo valor: ");
		y = ler.nextInt();
		
		if(x==y)
		{
			System.out.println("Valores id�nticos!ERROR,NOT FOUND.Encerrar programa.");
		}
		else if(x>y)
		{
			System.out.println("O maior valor dentre os 2 lidos �: " + x + ".");
		}
		else
		{
			System.out.println("O maior valor dentre os 2 lidos �: " + y + ".");
		}
	
	}

}
