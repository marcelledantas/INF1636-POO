
public class Main
{

	public static void main( final String[] args )
	{
		final String numGravame = " 350 000 ";
		
		if(extracted( numGravame)) {
			System.out.println( "Gravame inválido" );
		}
	}


	private static boolean extracted( final String numGravame )
	{
		if ( ( numGravame == null )
			|| ( numGravame.trim().isEmpty() )
			|| ( numGravame.replace( '"', ' ' ).trim().isEmpty() ) )
		{
			return true;
		}
		
		if ( numGravame.matches( "[0\\s]+" ) )
		{
			return true;
		}
		
		final int minimumNumGravameValue = 350000;

		try
		{				
			final int numGravameValue = Integer.parseInt( numGravame.replace( " ", "" ) );

			if ( numGravameValue < minimumNumGravameValue )
			{
				return true;
			}

		}
		catch ( final NumberFormatException e )
		{
			return true;
		}
		
		return false;

	}

}
