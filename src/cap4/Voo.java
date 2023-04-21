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
				as++;
			}
		}
	}
	
	public boolean reserva(int f, char a) {
		
		int i = f;
		int j = a - 'A';
		
		if(f > this.nFila || f < 0) {
			return false;
		}
		if(j < 0 || j > this.nAssentos) {
			return false;
		}
		
		Assento assentoReservar = this.assentos[i - 1][j];
		
		if(!assentoReservar.getEstado()) {
			System.out.println( "Assento já está reservado" );
			return false;
		}
		
		assentoReservar.reserva();
		return true;
	}
	
	public void imprimeMapa() {
	    
		System.out.printf( "     " );
		for(int nAssento = 0; nAssento < this.nAssentos; nAssento++) {
			System.out.printf( "%s ", (char)('A' + nAssento) );
		}
		
		System.out.println( "" );
		for(int i = 0; i < this.nFila; i++) {
			
			if(i < 9) {
				System.out.printf( "0%d - ", i + 1 );
			} else {
				System.out.printf( "%d - ", i + 1  );
			}
			
			for(int j = 0; j < this.nAssentos; j++) {
				Assento currAssento = this.assentos[i][j];
				if(currAssento.getEstado()) {
					System.out.printf( "L " );
				}
				else {
					System.out.printf( "X " );
				}
			}
			
			System.out.printf( "\n" );
		}
	}
	

}
