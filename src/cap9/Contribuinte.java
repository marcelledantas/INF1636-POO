package cap9;

import erro.SalarioZerado;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 28 de abr de 2023
 */
public abstract class Contribuinte
{

	public static Contribuinte[] listaContr()
	{
		final Contribuinte[] lst = new Contribuinte[6];

		lst[0] = new PFisica( "Joao Santos", 0, "11111" );
		lst[1] = new PJuridica( "Lojas AA", 0, "10055" );
		lst[2] = new PFisica( "Maria Soares", 1100, "22222" );
		lst[3] = new PJuridica( "Supermercados B", 1100, "10066" );
		lst[4] = new PFisica( "Carla Maia", 1500.00, "33333" );
		lst[5] = new PJuridica( "Posto XX", 1100, "10077" );

		return lst;
	}

	abstract public double calcImposto()
		throws SalarioZerado;

	public String getNome()
	{
		return this.nome;
	}

	protected String nome;

	protected double rendaBrt;
}
