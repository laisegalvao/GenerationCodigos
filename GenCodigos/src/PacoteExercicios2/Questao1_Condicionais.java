package PacoteExercicios2;
import java.util.Scanner;

public class Questao1_Condicionais {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int peso, excesso = 0, multa =0;
		
		System.out.println("Quantos kilos(peso) de tomate foi comprado? ");
		peso = ler.nextInt();
		
		if (peso > 50)
		{	
			excesso = excesso + (peso -50);
			multa = excesso * 4;
		}
		else if (peso <= 50 && peso>0)
		{
			excesso = 0;
		    multa = 0;
		}
		
		System.out.println("O excesso de peso foi de: "  + excesso + "Kg"+ " e a multa a ser paga � de: R$ " + multa + ".");
	}
}