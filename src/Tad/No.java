package Tad;

/**
 * <p>
 * </p>
 * 
 * @author imarc
 * @version 1.0 Created on 20 de abr de 2023
 */
public class No
{

	public No( final Object e, final No p )
	{
		this.elem = e;
		this.prox = p;
	}

	public Object getElem()
	{
		return this.elem;
	}

	public No getProx()
	{
		return this.prox;
	}

	public void setProx( final No o )
	{
		this.prox = o;
	}

	private Object elem;

	private No prox;

}
