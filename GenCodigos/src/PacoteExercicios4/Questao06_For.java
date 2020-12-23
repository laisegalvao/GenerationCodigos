package PacoteExercicios4;

import java.util.Scanner;

public class Questao06_For {
//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
//coletando dados sobre o salario e numero de filhos. A prefeitura deseja saber:
//a)média do salário da população; b) media do número de filhos;
//c)maior salario; d)percentual de pessoas com salario ate R$100,00.(FOR)

		public static void main(String[] args) 
		{
			Scanner ler = new Scanner(System.in);
			int  quantFilhos,i =1, contadorPessoas =0;//contadorPessoas p realizar a contagem do percentual de pes com sal >100
			float salario, mediaSalario =0, mediaFilhos =0, maiorSalario =0, percentualPessoas =0;
			// i =1 para que seja pessoa 1 até 20 (e nao pessoa 0 até 19, por ex.)
			for(i=1; i<=20; i++) {
				
				System.out.println("O habitante " + i + " possui salário de R$: ");
				salario = ler.nextFloat();
				mediaSalario = mediaSalario + salario; //pode escrever assim tb: mediaSalario+= salario
				
				System.out.println("O habitante " + i + " tem a seguinte quantidade de filhos: ");
				quantFilhos = ler.nextInt();
				mediaFilhos+= quantFilhos;
				
				if(maiorSalario < salario) {
						maiorSalario = salario;
				}
				
				if(salario <= 100) {
						contadorPessoas ++;
				}
			}
			
			mediaSalario = mediaSalario/ 20;
			System.out.println("A média do salário da população da cidade X é de: R$ " 
					+ mediaSalario + ".");
			
			mediaFilhos = mediaFilhos/20;
			System.out.println("A média do número de filhos da população da cidade X é: " + mediaFilhos + ".");
			
			System.out.println("O maior salário encontrado na população da cidade X foi: R$ " + maiorSalario);
			
			percentualPessoas = (contadorPessoas *100)/20;
			System.out.println("O percentual de pessoas com salário até R$100.00 da cidade X é de: " +
			percentualPessoas + ".");
		}
	}


