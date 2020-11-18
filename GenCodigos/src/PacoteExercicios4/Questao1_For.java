package PacoteExercicios4;

import java.util.Scanner;

public class Questao1_For {
//Informar todos os numeros de 1000 a 1999 que quando divididos por 11 obtemos 
//resto = 5. (FOR)

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int resto = 0; 
		int i = 1000; // i = contador do FOR
		
		for (i = 1000; i < 2000; i ++)
		{
			resto = i %11;
			if (resto == 5)
			{
				System.out.println("\n" + i);
				
			}
		
		}
		
	}

}
