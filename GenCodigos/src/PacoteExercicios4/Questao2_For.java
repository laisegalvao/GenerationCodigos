package PacoteExercicios4;

import java.util.Scanner;

public class Questao2_For {
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int npar = 0, nimpar = 0, numero;
		int i = 1;
		
		for(i = 1; i<=10; i ++)
		{
			System.out.println("Entre com o n�mero " + i + ":");
			numero = ler.nextInt();
			
			if(numero %2 ==0)
			{
				npar ++;
			}
			if(numero %2 !=0)
			{
				nimpar ++;
			}
		}
		
		System.out.println("O total de n�meros pares � de: " + npar + " e o total"
				+ " de n�meros �mpares �: " + nimpar + ".");
	}
}
