package PacoteExercicios2;

import java.util.Scanner;

public class Questao3_Condicionais {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		int n1, n2, n3, n4;
		
		System.out.println("Entre com n1: ");
		n1 = ler.nextInt();
		System.out.println("Entre com n2: ");
		n2 = ler.nextInt();
		System.out.println("Entre com n3: ");
		n3 = ler.nextInt();	
		System.out.println("Entre com n4: ");
		n4 = ler.nextInt();
		
			
		if (Math.pow(n3, 2) >= 1000)
		{
			System.out.println("Imprimindo o valor de n3: " + n3);
	
		}
		else 
		{
			n1 = (int) Math.pow(n1, 2);
			n2 = (int) Math.pow(n2, 2);
			n3 = (int) Math.pow(n3, 2);
			n4 = (int) Math.pow(n4, 2);
			
			System.out.println("Os valores de n1, n2, n3 e n4 s�o respectivamente: " +
			n1 + "," + n2 + "," + n3 + " e " + n4 + ".");
		
		}
	}
	
}
