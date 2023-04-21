package cap4;


/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 20 de abr de 2023
 */
public class Voo
{
	private Assento assentos[][];
	private int nFila;
	private int nAssentos;
	
	public Voo(int nf,int na) {
		char as;
		nFila = nf;
		nAssentos = na;
		assentos = new Assento[nf][na];
		
		for(int i = 0; i < nf; i++) {
			as = 'A';
			for(int j = 0; j < na; j++) {
				this.assentos[i][j] = new Assento(i + 1, as);
			}
			as++;
		}
	}
	
	public boolean reserva(int f, char a) {
		Assento assentoReservar = this.assentos[f][a];
		
		if(assentoReservar.getEstado()) {
			System.out.println( "Assento já está reservado" );
			return false;
		}
		
		assentoReservar.reserva();
		return true;
	}
	
	public void imprimeMapa() {
		for(int i = 0; i < this.nFila; i++) {
			for(int j = 0; j < this.nAssentos; j++) {
				Assento currAssento = this.assentos[i][j];
				if(currAssento.getEstado()) {
					System.out.printf( "L " );
				}
				else {
					System.out.printf( "X " );
				}
			}
		}
	}

}
