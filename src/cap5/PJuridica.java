package cap5;


/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 23 de abr de 2023
 */
public class PJuridica extends Contribuinte
{
	protected String cnpj;
	public PJuridica(String n,double r,String c) {
	// inicialização das varáveis de instância
		this.cnpj = c;
		this.nome = n;
		this.rendaBrt = r;
	}
	public double calcImposto() {
		// Cálculo do imposto
		return 0.10 * rendaBrt + rendaBrt;
	}
}
