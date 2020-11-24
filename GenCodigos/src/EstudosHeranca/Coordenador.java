package EstudosHeranca;

public class Coordenador extends Pessoa{
	private String CursoCordenado; //cria��o de um atributo da classe Coordenador

//cria��o do construtor:
	public Coordenador(String nome, int matricula, String cursoCordenado)
	{
		super(nome, matricula);
		this.CursoCordenado = cursoCordenado;
	}

	public String getCursoCordenado() {
		return CursoCordenado;
	}

	public void setCursoCordenado(String cursoCordenado) {
		CursoCordenado = cursoCordenado;
	}
	
}
