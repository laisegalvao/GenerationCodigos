package PacoteExercicios4;

import java.util.Scanner;

public class Questao07_For {
//Desenvolver um sistema que efetue a soma de todos os numeros impares 
//que são  multiplos de tres e que se encontram no conjunto dos numeros de 1 ate 500. (FOR)
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int soma =0, i =0;
		
		for(i= 0; i<=500; i++) {
			
			if(i %3 ==0) {
				if(!(i %2 ==0)) {
						soma= soma +i;
				}
			}
			
		}
		
		System.out.println("A soma de todos os números ímpares que são múltiplos de 3 e "
				+ "que estão no conjunto dos números de 1 até 500 é de: " + soma + ".");
	}
}
