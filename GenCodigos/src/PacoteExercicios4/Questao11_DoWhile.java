package PacoteExercicios4;

import java.util.Scanner;

public class Questao11_DoWhile {
//Faca um programa que pegue um numero do teclado e calcule a soma de todos os numeros  de 1 ate ele.	
// Ex.: o usuario entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28. .(DO...WHILE)
		
	public static void main(String[] args)
		{
			Scanner ler = new Scanner(System.in);
			int numero, soma = 0, i;
				
			System.out.println("Entre com um número:");
			numero = ler.nextInt();
			i = numero;
			
			do
			{
				soma = soma + i;
				i --;	
			}
			while (i >0);
			
			System.out.println("A soma de todos os números é: " + soma + ".");	
		}

	}
