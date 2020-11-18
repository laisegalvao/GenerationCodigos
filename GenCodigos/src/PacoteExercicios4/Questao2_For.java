package PacoteExercicios4;

import java.util.Scanner;

public class Questao2_For {
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int npar = 0, nimpar = 0, numero;
		int i = 1;
		
		for(i = 1; i<=10; i ++)
		{
			System.out.println("Entre com o número " + i + ":");
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
		
		System.out.println("O total de números pares é de: " + npar + " e o total"
				+ " de números ímpares é: " + nimpar + ".");
	}
}
