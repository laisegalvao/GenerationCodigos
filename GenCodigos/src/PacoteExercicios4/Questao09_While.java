package PacoteExercicios4;

import java.util.Scanner;

public class Questao09_While {
//Obtenha um numero digitado pelo usuario e repita a operacao de multiplicar ele por tres  
//(imprimindo o novo valor) ate que ele seja maior do que 100.Ex.: se o usuario digita 5,  
//deveremos observar na tela a seguinte sequencia: 5 15 45 135.(WHILE)


	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Entre com um número: ");
		numero = ler.nextInt();
		
		while(numero < 100) {
			numero = numero * 3;
			System.out.println(numero);
		}
	}
}
