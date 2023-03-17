package cap3;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 16 de mar de 2023
 */
public class EX0303
{

	public static void main( final String[] args )
	{
		// System.out.println( obtemPi(3) ); // It cannot make a static reference to a non static
		// method
		System.out.println( Matematica.pi( 1000000 ) );
	}

	public double obtemPi( final int n )
	{
		return Matematica.pi( n );
	}
}
