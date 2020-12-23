package PacoteExercicios4;

import java.util.Scanner;

public class Questao05_DoWhile {
//Escrever um programa que receba varios numeros inteiros no teclado. 
//E no final imprimir a media dos numeros multiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int numero =0, contador = 0; //contador p acumular
		float media = 0;
		
		do {
			
			System.out.println("Entre com um número inteiro (para encerrar a leitura digite 0): ");
			numero = ler.nextInt();
			
			if (numero %3 == 0 && numero !=0) {
					media = media + numero;
					contador ++;
					
			}
		} while (numero !=0);
			media = media / contador;
			
			System.out.println("A media dos números múltiplos de 3 é: " + media);
		
	}
}
