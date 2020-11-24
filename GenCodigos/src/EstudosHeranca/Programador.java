package EstudosHeranca;

public interface Programador {
	void pensando1(char[] ideias); // criou método com um parametro : vetor --> ideias
	String digitando(); //criou um outro método nessa interface Programador
	void pensando(char[] charArray);
		
// depois vai criar uma outra classe que vai impletar esses 2 interfaces (Leitor e Programador)	
}
