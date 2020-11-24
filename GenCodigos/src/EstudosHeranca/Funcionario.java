package EstudosHeranca;

public class Funcionario extends Pessoa { //criação do funcionario que vai herdar da Pessoa
//utiliza o extends pra informar que vai herdar + o nome da classe que vai estar dando a herança
	private String departamento; //criando atributo do próprio funcionário

//criação do construtor do funcionario:
	public Funcionario(String nome, int matricula, String departamento)
	{//os argumentos são da superclasse(nome e matricula) + o departamento criado nessa classe funcionario
		super(nome, matricula);
		this.departamento = departamento;
//super indica q está criando uma relação com a classe principal(superclasse) e vai trazer de lá o
//nome e a matricula
	}
//criação dos gats e sets do departamento:
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
