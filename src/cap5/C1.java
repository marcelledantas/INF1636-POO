package cap5;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 23 de abr de 2023
 */
public class C1
	extends C
{
	{
		System.out.println( "C1: Instance initializer block executed" );
	}

	static{
		System.out.println( "C1: Static block executed 1" );
	}
	
	static{
		System.out.println( "C1: Static block executed 2" );
	}
	
	public C1()
	{
		this.v1 = this.v2 = 10;
		s1 += 10;
	}

	public static void ms1( final int a )
	{
		s1 += 2 * a;
	}

	public int calcula( final int b )
	{
		return b + 10;
	}

	public int executa( final int b )
	{
		ms1( b );
		return retorna( b );
	}

}
