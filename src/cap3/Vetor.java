package cap3;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 16 de mar de 2023
 */
public class Vetor
{

	/**
	 * <p>
	 * </p>
	 */
	public Vetor()
	{
	}

	/**
	 * <p>
	 * </p>
	 *
	 * @param x
	 * @param y
	 */
	public Vetor( final double x )
	{
		this.x = x;
	}

	/**
	 * <p>
	 * </p>
	 *
	 * @param x
	 * @param y
	 */
	public Vetor( final double x, final double y )
	{
		super();
		this.x = x;
		this.y = y;
	}

	public static Vetor somav2( final Vetor v1, final Vetor v2 )
	{
		return new Vetor( v1.x + v2.x, v1.y + v2.y );
	}

	public void exibe()
	{
		System.out.println( "x= " + this.x );
		System.out.println( "y= " + this.y );
	}

	public void soma( final Vetor v )
	{
		this.x += v.x;
		this.y += v.y;
	}

	private double x;

	private double y;

	{
		System.out.println( this.x );
		System.out.println( this.y );
	}

}
