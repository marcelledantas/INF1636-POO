package Tad;


/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 20 de abr de 2023
 */
public class Lista
{
	private int tam=0;
	private No ini=null;
	private No fin=null;
	private No corr=null;
	
	public boolean vazio() {
		if(this.tam == 0) {
			return true;
		}
		
		return false;
	}
	
	public void insIni(Object x) {
		No newElemNo = new No( x, this.ini );
		this.ini = newElemNo;
		
		if(this.tam == 0) {
			this.fin = this.ini;
		}
		
		this.tam ++;
	}
	
	public void insFin(Object x) {
		if(this.tam == 0) {
			insIni( x );
			return;
		}
		No newElemNo = new No( x, null );
		this.fin.setProx( newElemNo );
		this.fin = newElemNo;
		this.tam++;
	}

	public Object retIni() {
		if(this.tam == 0) {
			return null;
		}
		Object referenceIni = this.ini.getElem();
		No newIniNo = this.ini.getProx();
		this.ini = newIniNo;
		this.tam--;
		
		if(this.tam == 0) {
			this.fin = null;
		}
		
		return referenceIni;
	}
	
	public Object retFin() {
		if(this.tam == 0) {
			return null;
		}
		
		if(this.tam == 1) {
			Object referenceFin = this.ini.getElem();
			this.ini = null;
			this.tam--;
			return referenceFin;
		}
		
		No p = this.ini;
		No penultimo = null;
		
		while(p != null) {
			
			if(p.getProx() == this.fin) {
				penultimo = p;
			}
			
			p = p.getProx();
		}
		
		No referencePenultimo = this.fin;
		this.fin = penultimo;
		return referencePenultimo;
	}
		
	public void posIni() {
				
		this.corr = this.ini;
	}
		
	public Object prox() {
		if(this.corr == null) {
			return null;
		}
		
		Object corrent = this.corr.getElem();
		
		this.corr = this.corr.getProx();
		return corrent;
	}
}
