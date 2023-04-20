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
		this.tam ++;
	}
	
	public void insFin(Object x) {
		No newElemNo = new No( x, this.fin );
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
		return referenceIni;
	}
	
	public Object retFin() {
		if(this.tam == 0) {
			return null;
		}
		Object finReference = this.fin.getElem();
		this.fin = null;
		return finReference;
	}
		
	public void posIni() {
		if(this.tam == 0) {
			this.corr = null;
		}
		
		this.ini = this.corr;
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
