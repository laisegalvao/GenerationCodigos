package PacoteExercicios3;

import java.util.Scanner;

public class Questao2_flow {
//Quest�o:Escreva um programa que verifique a validade de uma senha fornecida 
//pelo usu�rio. A senha v�lida � o n�mero 1234. Devem ser impressas as seguintes 
//mensagens: ACESSO PERMITIDO caso a senha seja v�lida. 
//ACESSO NEGADO caso a senha seja inv�lida.

	public static void main(String[]args)
	{
		Scanner ler = new Scanner(System.in);
		int senha;
		
		System.out.println("S� � permitida a entrada com senha. Digite a senha: ");
		senha = ler.nextInt();
		
		if(senha == 1234)
		{
			System.out.println("Senha v�lida.Acesso PERMITIDO!");
		}
		else
		{
			System.out.println("Acesso NEGADO!");
		}
	}
	
	
}
