package PacoteExercicios7;

public class main {
	
	public static void main(String[] args)
	{
		Animal cachorro = new Cachorro("Cacau", 4);
		Animal cavalo = new Cavalo("Pegasus", 7);
		Animal preguica= new Preguica("Dorminhoca", 5);
		Animal animal = new Animal("Bichinhos",0);
		
		//System.out.println(cachorro.getNome());
		cachorro.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
		animal.emitirSom();
		
	}

}
