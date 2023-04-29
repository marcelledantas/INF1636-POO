package Teste;

/**
 * <p>
 * </p>
 * 
 * @author imarc
 * @version 1.0 Created on 28 de abr de 2023
 */
public class Main
{

	/**
	 * <p>
	 * </p>
	 * 
	 * @param args
	 */
	public static void main( final String[] args )
	{
		A a1 = new B();
		a1.m1();
		A.m2();

		B b1 = (B) a1;
		b1.m1();
		B.m2();

	}

}
