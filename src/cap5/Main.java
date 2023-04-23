package cap5;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 23 de abr de 2023
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
		final C v = new C1();
		System.out.println( v.executa( 5 ));
	}

}

/*
 * C v = new C1(), como C1 extende C, o construtor de C1 irá chamar o construtor default de C que é a superclass, 
 * e depois irá executar o construtor de C1.
 * 
 * 
 * 
 */
