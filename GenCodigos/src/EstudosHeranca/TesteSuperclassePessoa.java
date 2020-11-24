package EstudosHeranca;

public class TesteSuperclassePessoa {
	public static void main(String[] args)
	{
		Pessoa Jessica = new Pessoa("Jessica.", 5555);//instanciou Jessica como Pessoa e colocou o nome e sua matr�cula
		Funcionario Pedro = new Funcionario ("Pedro.",222, "TI.");
		Pessoa Maria = new Funcionario("Maria.", 3333, "RH.");
		Pessoa Jose = new Coordenador("Jose.", 4444, "Ci�ncias.");
		
		System.out.println(Jessica.getMatricula());
		System.out.println(Pedro.getDepartamento());
		System.out.println(Maria.getNome());
		System.out.println(Jose.getMatricula());
	}

}
