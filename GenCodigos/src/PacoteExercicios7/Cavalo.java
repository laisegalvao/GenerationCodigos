package PacoteExercicios7;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom()
	{
		System.out.println("hinn in in!");
	}
	
	public void correr()
	{
		System.out.println("O cavalo está correndo.");
	}
	
}
