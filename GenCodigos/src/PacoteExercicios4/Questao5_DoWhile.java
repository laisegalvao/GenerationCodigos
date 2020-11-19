package PacoteExercicios4;

import java.util.Scanner;

public class Questao5_DoWhile {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int numero =0, soma = 0; contador =0; //contador p acumular
		float media;
		
		do
		{
			System.out.println("Entre com os números: ");
			numero = ler.nextInt();
			
			if (numero%3=0)
			{
				soma = soma + numero;
				//somar a quantidade de vezes que  
			}
		while (numero !=0);
		}
	}

}
