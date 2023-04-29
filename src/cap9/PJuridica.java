package cap9;

import erro.SalarioZerado;
import erro.SalarioZeradoPJ;

/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 28 de abr de 2023
 */
public class PJuridica extends Contribuinte
{
	protected String cnpj;
	
	
	public PJuridica(String n,double r,String c)
	{
		nome=n;
		rendaBrt=r;
		cnpj=c;
	}
	
	public double calcImposto() throws SalarioZeradoPJ
	{
		if(rendaBrt == 0) {
			throw new SalarioZeradoPJ("Salario Zerado PJ");
		}
		return rendaBrt*0.1;
	}
}
