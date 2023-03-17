package cap4;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 16 de mar de 2023
 */
public class A
{

	public A()
	{
		this.x *= this.x;
		this.y *= this.y;
	}

	public void exibe()
	{
		System.out.printf( "x=%d y=%d", this.x, this.y );
	}

	int x, y;

}
