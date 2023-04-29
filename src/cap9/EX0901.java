package cap9;

import erro.SalarioZeradoPF;
import erro.SalarioZeradoPJ;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 28 de abr de 2023
 */
public class EX0901
{

	public static void main( final String[] args )

	{
		Contribuinte[] lst;

		lst = Contribuinte.listaContr();

		System.out.printf( "NOME                       IMPOSTO\n" );
		System.out.printf( "====================       =======\n\n" );

		for ( final Contribuinte c : lst )
		{
			try
			{
				System.out.printf( "%-20s     %9.2f\n", c.getNome(), c.calcImposto() );
			}
			catch ( final SalarioZeradoPJ e )
			{
				System.out.printf( "%-20s %s\n", c.getNome(), e.getMessage() );
			}
			catch ( final SalarioZeradoPF e )
			{
				System.out.printf( "%-20s %s\n", c.getNome(), e.getMessage() );
			}
			catch ( final Exception e )
			{
				System.out.printf( "Erro desconhecido" );
			}
		}
	}
}
