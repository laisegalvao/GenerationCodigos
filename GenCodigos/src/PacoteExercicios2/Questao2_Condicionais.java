package PacoteExercicios2;

import java.util.Scanner;

public class Questao2_Condicionais {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		String C;
		int N, sal�rio = 0, horasT, horasE, sal�rioE =0;
		
		System.out.println("Entre com o c�digo do trabalhador: ");
		C = ler.nextLine();
		System.out.println("Entre com a quantidade de horas trabalhadas: ");
		horasT = ler.nextInt();
		
		if (horasT > 50)
		{
			sal�rio = 50 * 10;
			sal�rioE = (horasT - 50) * 20;
		}
		else
		{
			sal�rio = horasT * 10;
		}
	
		System.out.println("O trabalhador " + C + " recebe sal�rio total de R$ " + sal�rio +
				" e sal�rio excedente de R$ " + sal�rioE + "");
		
	}

}
