package PacoteExercicios2;

import java.util.Scanner;

public class Questao4_Condicionais {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		int n;
		
		System.out.println("Entre com um n�mero inteiro: ");
		n = ler.nextInt();
		
		if(n %2 ==0)
		{
			System.out.printf("Trata-se de um n�mero par e ");
		}
		else if (n %2!=0)
		{
			System.out.printf("Trata-se de um n�mero �mpar e ");
		}	
		if(n >0)
		{
			System.out.printf("positivo!");
			
		}
		else if (n < 0)
		{
			System.out.printf("negativo!");
		}
		
	}
}
