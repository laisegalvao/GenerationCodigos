package PacoteExercicios3;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int mes;
		
		System.out.println("Digite um n�mero de 1 at� 6 para saber o m�s: ");
		mes = ler.nextInt();
		switch(mes)
		{
			case 1:
				System.out.println("Janeiro.");
				break;
			case 2:
				System.out.println("Fevereiro.");
				break;	
			case 3:
				System.out.println("Mar�o.");
				break;
			case 4:
				System.out.println("Abril.");
				break;
			case 5:
				System.out.println("Maio.");
				break;
			case 6:
				System.out.println("Junho.");
				break;
			default:
				System.out.println("Opera��o inv�lida.");
				break;
		}
		
	}

}
