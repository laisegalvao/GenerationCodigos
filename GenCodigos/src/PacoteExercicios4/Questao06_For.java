package PacoteExercicios4;

import java.util.Scanner;

public class Questao06_For {
//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
//coletando dados sobre o salario e numero de filhos. A prefeitura deseja saber:
//a)m�dia do sal�rio da popula��o; b) media do n�mero de filhos;
//c)maior salario; d)percentual de pessoas com salario ate R$100,00.(FOR)

		public static void main(String[] args) 
		{
			Scanner ler = new Scanner(System.in);
			int  quantFilhos,i =1, contadorPessoas =0;//contadorPessoas p realizar a contagem do percentual de pes com sal >100
			float salario, mediaSalario =0, mediaFilhos =0, maiorSalario =0, percentualPessoas =0;
			// i =1 para que seja pessoa 1 at� 20 (e nao pessoa 0 at� 19, por ex.)
			for(i=1; i<=20; i++) {
				
				System.out.println("O habitante " + i + " possui sal�rio de R$: ");
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
			System.out.println("A m�dia do sal�rio da popula��o da cidade X � de: R$ " 
					+ mediaSalario + ".");
			
			mediaFilhos = mediaFilhos/20;
			System.out.println("A m�dia do n�mero de filhos da popula��o da cidade X �: " + mediaFilhos + ".");
			
			System.out.println("O maior sal�rio encontrado na popula��o da cidade X foi: R$ " + maiorSalario);
			
			percentualPessoas = (contadorPessoas *100)/20;
			System.out.println("O percentual de pessoas com sal�rio at� R$100.00 da cidade X � de: " +
			percentualPessoas + ".");
		}
	}


