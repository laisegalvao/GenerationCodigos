package PacoteExercicios4;

import java.util.Scanner;

public class Questao10_DoWhile {
//Faca um programa que mostre uma contagem na tela de 233 a 456, so que contando 
//de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando nao estiver. (DO...WHILE)
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int contador = 233;
		
		do {
				if(contador >= 300 && contador <= 400) {
						contador = contador + 3;
				}
				else {
					 contador = contador + 5;
				}
				System.out.println(contador);
		}
		while(contador < 456);
		
	}
}
