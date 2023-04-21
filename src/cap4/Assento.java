package cap4;


/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 20 de abr de 2023
 */
public class Assento
{
	private int fila;
	private char assento;
	private boolean livre = true;
	
	public Assento( int f, char a ) {
		this.fila = f;
		this.assento = a;
	}
	
	public boolean getEstado() {
		return this.livre;
	}
	
	public void reserva() {
		this.livre = false;
	}
}
