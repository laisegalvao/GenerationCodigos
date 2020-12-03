package PacoteExercicios4;

import java.util.Scanner;

public class Questao6_For {
	 
	
		public static void main(String[] args) 
		{
			Scanner ler = new Scanner(System.in);
			/* variables */
			int sum=0;
			/* calculate */
			for (int i = 1; i <= 500; i++)
				if ((i % 3) == 0 && (i % 2) != 0)
					sum += i;
			/* output */
			System.out.println("\nA soma dos número múltiplo de três e impares: " + sum + ".");
		}
	}


