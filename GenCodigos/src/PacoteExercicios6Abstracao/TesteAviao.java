package PacoteExercicios6Abstracao;

public class TesteAviao {
	
	public static void main(String[] args)
	{
		Aviao aviao = new Aviao(7000, 1.5, "boing");//aqui pode ser construtor vazio (como coloquei
		//em coment�rio l� na classe Aviao. Mas como est� aqui eu posso colcocar na ordem q l� est�
		//mesmo que sejam valores diferentes que vai subescrever por esses de baixo..
		aviao.setModelo("Boing");
		aviao.setQuantidadeLugares(70);
		aviao.setVelocidade(1500.6);
		
		System.out.println(aviao.toString());
	}

}
