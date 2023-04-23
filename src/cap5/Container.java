package cap5;

import java.security.Timestamp;

/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 23 de abr de 2023
 */
public class Container
{
	private Poligono lst[] = new Poligono[100];
	private int tam = 0;
	
	public void addPoligono(Poligono p) {
		if(this.tam < 100) {
			this.lst[this.tam] = p;
			this.lst[this.tam].desenha();
			this.tam ++;
		}
	}
}
