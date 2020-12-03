package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Colecoes {
	
	public static void main(String []args)
	{
		Collection< String> nomes = new ArrayList();
		//adicionar alguns nomes p o ArrayList: (nome da collection q no ex. é nomes + add.) p adicionar os elementos dentro do Array
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafael");
		//modos de manipular a collection:
		if(nomes.isEmpty()) //isEmpety serve p verificar se os dados dentro de um list estão vazio.e vai dar um retorno de um valor boleano (t ou f)
		{
			System.out.println("Lista vazia.");
		}
		else
		{
			System.out.println("Lista de nomes: " + nomes);
		}
		
		
		
		//mostrar a collection:
		//System.out.println("Lista de nomes: " + nomes);
		
		//modos de manipular a collection
	}

}
