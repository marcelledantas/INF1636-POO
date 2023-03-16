package cap2;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 16 de mar de 2023
 */
public class Socio
{

	/**
	 * <p>
	 * </p>
	 *
	 * @param matric
	 */
	public Socio( final int matric )
	{
		super();
		this.matric = matric;
	}

	public String getMatric()
	{

		final int lastDigit = this.matric % 10;
		final int restDigits = this.matric / 10;

		return ( Integer.toString( restDigits ) + "-" + Integer.toString( lastDigit ) );
	}

	private String dtNasc;

	private String endereco;

	private int matric;

	private String nome;
}
