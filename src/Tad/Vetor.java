package Tad;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 20 de abr de 2023
 */
public class Vetor
{

	private Vetor()
	{

	}

	public Vetor( final double x, final double y )
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public Vetor clone()
	{
		return new Vetor( this.x, this.y );
	}

	@Override
	public String toString()
	{
		return String.format( "(%.2f, %.2f)", this.x, this.y );
	}

	private double x;

	private double y;
}
