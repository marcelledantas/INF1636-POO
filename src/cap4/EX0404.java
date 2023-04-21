package cap4;


/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 20 de abr de 2023
 */
public class EX0404
{

	/**
	 * <p></p>
	 * @param args
	 */
	public static void main( String[] args )
	{
		Voo v=new Voo(10,4);
		v.reserva(1,'A');
		v.reserva(1,'B');
		v.reserva(4,'C');
		v.reserva(4,'D');
		v.reserva(10,'A');

		v.imprimeMapa();
		
	}
}

