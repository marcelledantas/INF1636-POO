package cap3;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 16 de mar de 2023
 */
public class EX0301
{

	public static void main( final String[] args )
	{
		final Vetor v1 = new Vetor( 3, 4 );
		final Vetor v2 = new Vetor( 7, 6 );

		v1.soma( v2 );
		v1.exibe();

		Vetor.somav2( v1, v2 ).exibe();
	}// func
}
