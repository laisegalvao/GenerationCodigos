package EstudosHeranca;

public class ParticipanteForum implements Leitor, Programador{ // implements p implemtar as 2 interfaces
	String pensamento; //criou atributo pensamento
	public String lendo() //chamou o lendo do Leitor
	{
		return "Forum";
	}
	public void pensando(char[] ideias) //chamou o pensando do Programador
	{
		pensamento = new String (ideias);
	}
	public String digitando()//criou o digitando nessa própria classe ParticipanteForum
	{
		return pensamento;
	}
	private String aprendendo()//criou o aprendendo nessa própria classe ParticipanteForum
	{
		return "JAVA";
	}
//dps vai criar uma classe para demonstrar tudo isso(TesteInterface)..
}
