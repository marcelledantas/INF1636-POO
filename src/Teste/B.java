package Teste;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 28 de abr de 2023
 */
public class B
	extends A
{

	public static void m2()
	{
		System.out.println( "m2 (static) - classe B" );
	}

	@Override
	public void m1()
	{
		// this.num = 2; Erro
		System.out.println( "m1 - classe B" );
	}

	final int num = 1;
}
