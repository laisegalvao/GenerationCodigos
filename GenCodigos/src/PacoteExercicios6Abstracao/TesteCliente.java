package PacoteExercicios6Abstracao;

public class TesteCliente {
	
	public static void main(String [] args)
	{
		Cliente cliente = new Cliente ("Jose.", "20.", "4445-0,Poupança.");
		
		//Aviao aviao = new Aviao();
		
		//aviao.setModelo("boing");
		//aviao.setQuantidadeLugares(200);
		//aviao.setVelocidade(1500.6);
		
		//System.out.println(aviao.toString());
		
		System.out.println(cliente.getDadosdoCliente());
	}

}
