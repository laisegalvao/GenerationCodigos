package PacoteExercicios4;

import java.util.Scanner;

public class Questao4_DoWhile {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int numero, soma = 0;
		
		do
		{
			System.out.println("Entre com os n�meros: ");
			numero = ler.nextInt();
			soma = soma + numero;
		}
		while (numero !=0);
		
		System.out.println("A soma de todos os n�meros �: " + soma + ".");	
	}

}

