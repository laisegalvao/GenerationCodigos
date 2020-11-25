package PacoteExercicios7;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom()
	{
		System.out.println("uhhh uhhh!");
	}
	
	public void correr()
	{
		System.out.println("A preguiça está correndo");
	}
	
	public void subirArvores()
	{
		System.out.println ("A preguiça está subindo nas árvores");
	}
}
