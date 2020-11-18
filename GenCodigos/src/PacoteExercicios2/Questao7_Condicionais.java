package PacoteExercicios2;

import java.util.Scanner;

public class Questao7_Condicionais {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		float b =0,h =0 , A;
		
		System.out.println("Informe um valor para a base: ");
		b = ler.nextFloat();
		
		System.out.println("Informe um valor para a altura: ");
		h = ler.nextFloat();
		
		if(b>=0 && h>=0)
		{
			A = b * h/2;
			
			System.out.println("O valor da área do triângulo é: " + A + ".");
		}
		else
		{
			System.out.println("O valor informando não é válido! Informe valores positivos e maiores que zero.");
		}
	}

}
