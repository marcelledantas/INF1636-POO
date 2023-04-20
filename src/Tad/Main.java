package Tad;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 20 de abr de 2023
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
		final Lista x = new Lista();

		Vetor v;

		x.insIni( new Vetor( 1.0, 2.0 ) );
		x.insIni( new Vetor( 2.0, 2.0 ) );
		x.insIni( new Vetor( 1.0, 3.0 ) );
		x.insIni( new Vetor( 1.5, 2.0 ) );

		x.posIni();
		v = ( Vetor ) x.prox();
		while ( v != null )
		{
			System.out.printf( "%s\n", v.toString() );
			v = ( Vetor ) x.prox();
		}
	}

}
