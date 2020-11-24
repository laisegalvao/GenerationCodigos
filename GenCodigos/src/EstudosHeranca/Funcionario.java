package EstudosHeranca;

public class Funcionario extends Pessoa { //cria��o do funcionario que vai herdar da Pessoa
//utiliza o extends pra informar que vai herdar + o nome da classe que vai estar dando a heran�a
	private String departamento; //criando atributo do pr�prio funcion�rio

//cria��o do construtor do funcionario:
	public Funcionario(String nome, int matricula, String departamento)
	{//os argumentos s�o da superclasse(nome e matricula) + o departamento criado nessa classe funcionario
		super(nome, matricula);
		this.departamento = departamento;
//super indica q est� criando uma rela��o com a classe principal(superclasse) e vai trazer de l� o
//nome e a matricula
	}
//cria��o dos gats e sets do departamento:
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
