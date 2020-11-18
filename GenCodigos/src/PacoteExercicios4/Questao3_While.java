package PacoteExercicios4;

import java.util.Scanner;

public class Questao3_While {
//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos 
//de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando 
//a idade for =-99. (WHILE)
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int idade = 0, menorIdade =0, maiorIdade = 0;
		
		while (idade != -99)
		{
			System.out.println("Digite aqui a idade de várias pessoas: ");
			idade = ler.nextInt();
			
			if (idade>=0 && idade <21)
			{
				menorIdade ++;
			}
			if(idade>50)
			{
				maiorIdade ++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + menorIdade + ".");
		System.out.println("\nTotal de pessoas com mais de 50 anos: " + maiorIdade + ".");
	}
}
