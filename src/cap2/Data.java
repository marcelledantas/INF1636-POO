package cap2;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 16 de mar de 2023
 */
public class Data
{

	/**
	 * <p>
	 * </p>
	 *
	 * @param ano
	 * @param dia
	 * @param mes
	 */
	public Data( final int dia, final int mes, final int ano )
	{
		super();
		this.ano = ano;
		this.dia = dia;
		this.mes = mes;
	}

	public int get( final int e )
	{
		if ( e == 1 )
		{
			return this.dia;
		}
		else if ( e == 2 )
		{
			return this.mes;
		}
		else if ( e == 3 )
		{
			return this.ano;
		}
		else
		{
			return -1;
		}
	}

	public String getString()
	{
		return ( Integer.toString( this.dia )
			+ "/"
			+ Integer.toString( this.mes )
			+ "/"
			+ Integer.toString( this.ano ) );
	}

	private int ano;

	private int dia;

	private int mes;

}
