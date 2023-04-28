package Tad;

import cap5.Contribuinte;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 28 de abr de 2023
 */
public class EX0504
{

	/**
	 * <p>
	 * </p>
	 *
	 * @param args
	 */
	public static void main( final String[] args )
	{
		final Lista ls = new Lista();
		Contribuinte[] lst;

		lst = Contribuinte.listaContr();

		// Inserindo elementos no inicio da lista
		for ( final Contribuinte element : lst )
		{
			ls.insIni( element );
		}

		ls.posIni();
		Contribuinte iter = ( Contribuinte ) ls.prox();
		// Percorrendo a lista e imprimindo nome e imposto
		while ( iter != null )
		{
			System.out.println( "Nome: " + iter.getNome() + " - Imposto: " + iter.calcImposto() );
			iter = ( Contribuinte ) ls.prox();
		}

	}

}
