package cap3;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 16 de mar de 2023
 */
public class Matematica
{

	public static double pi( final int n )
	{
		double sumFraction = 0;
		boolean plusOperator = true;

		if ( n < 0 )
		{
			return -1;
		}

		for ( int i = 1; i <= n; i += 2 )
		{
			if ( plusOperator )
			{
				sumFraction += 1.0 / i;
				plusOperator = false;
			}
			else
			{
				sumFraction -= 1.0 / i;
				plusOperator = true;
			}
		}

		return 4 * sumFraction;
	}
}
