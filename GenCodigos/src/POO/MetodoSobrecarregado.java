package POO;

public class MetodoSobrecarregado {
	public void testaMetodosSobrecarregados()
	{
		System.out.printf("Sal�rio em n�mero inteiro: %d. \n", salario(1000));//m�todo salario, que vamos criar
		System.out.printf("Sal�rio em n�mero double: %f. \n", salario(7.500));
	}
	public int salario(int valorInt) //m�todo salario
	{
		System.out.printf("Sal�rio com argumento inteiro: %d. \n", valorInt);
		return valorInt * valorInt;
	}
	public double salario(double valorDouble)
	{
		System.out.printf("Sal�rio com argumento double: %f. \n", valorDouble);
		return valorDouble * valorDouble;
	}
//foram criados 2 m�todos com o mesmo nome, mas com par�metros diferentes.(um do tipo Int e outro Double)
//vamos criar agora outra classe p testar(testaMetodosSobre..)
}
