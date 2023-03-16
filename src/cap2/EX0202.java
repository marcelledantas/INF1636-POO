package cap2;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 16 de mar de 2023
 */
public class EX0202
{

	public static void main( final String[] args )
	{
		final Data d = new Data( 11, 8, 2011 );
		final String meses[] = {"JAN",
								"FEV",
								"MAR",
								"ABR",
								"MAI",
								"JUN",
								"JUL",
								"AGO",
								"SET",
								"OUT",
								"NOV",
								"DEZ"};

		System.out.println( "Data Editada: " + d.getString() );

		System.out.println( d.get( 1 ) + " de " + meses[d.get( 2 ) - 1] + " de " + d.get( 3 ) );
	}
}
