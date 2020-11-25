package PacoteExercicios7;

import java.util.ArrayList;
import java.util.List;

public class CollectionAtividade3 {
	

	public static void main(String []args)
	{
		List <String> acessorios = new ArrayList <String>();
		acessorios.add("bolsas");
		acessorios.add("cintos");
		acessorios.add("brincos");
		acessorios.add("colares");
		acessorios.add("sapatos");
		acessorios.add("sandalias");
		acessorios.add("pulseiras");
		acessorios.add("aneis");
		
		System.out.println("Os acessórios da loja são: " + acessorios);
		acessorios.remove("sapatos");
		acessorios.remove("pulseiras");
		
		System.out.println("Verificação da lista atualizada: " + acessorios);
		
		for (String substituicao: acessorios) {
			
			System.out.println(acessorios.indexOf(substituicao) + "|" + substituicao);
			//listando para fazer a substituição (0,1,2..)
		}
		acessorios.set(3, "short");
		System.out.println(acessorios);
		
		
	}
}
