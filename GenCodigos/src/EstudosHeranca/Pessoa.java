package EstudosHeranca;

public class Pessoa {
	private String nome;
	private int matricula;
	
//criando o construtor:
	public Pessoa(String nome, int matricula)
	{
		this.nome = nome;
		this.matricula = matricula;
	}
//uma forma de encapsular � criar o gat e set de cada atributo, vamos l�:

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

// aqui � a Superclasse Pessoa.. agora vamos criar mais duas classes que v�o herdar..
	
}
