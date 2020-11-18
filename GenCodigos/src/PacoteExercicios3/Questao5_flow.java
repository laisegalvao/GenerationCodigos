package PacoteExercicios3;

import java.util.Scanner;

public class Questao5_flow {
//Questão:Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso. 
//Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
//Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.
	
	public static void main(String[]args)
	{
		Scanner ler = new Scanner(System.in);
		int lados;
		float l1 =0, areat, areaq;
		
		System.out.println("Entre com o número de lados de um polígono regular: ");
		lados = ler.nextInt();
		
		if(lados<3)
		{
			System.out.println("");
		}
	}
	
	
}
	