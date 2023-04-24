package cap5;

/**
 * <p>
 * </p>
 * 
 * @author imarc
 * @version 1.0 Created on 23 de abr de 2023
 */
public class PFisica
	extends Contribuinte
{

	protected String cpf;

	public PFisica( String n, double r, String c )
	{
		// inicialização das varáveis de instância
		this.cpf = c;
		this.nome = n;
		this.rendaBrt = r;
	}

	@Override
	public double calcImposto() {
		double imposto = 0;
		if(rendaBrt >= 0.0 && rendaBrt <= 1.400) {
			imposto = 0.00 * rendaBrt + rendaBrt; 
		}
		else if(rendaBrt > 1400.00 && rendaBrt <= 2100.00) {
			imposto = 0.10 * rendaBrt + rendaBrt;
		}
		else if(rendaBrt > 2100.00 && rendaBrt <= 2800.00) {
			imposto = 0.15 * rendaBrt + rendaBrt;
		}
		else if(rendaBrt > 2800.00 && rendaBrt <= 3600.00) {
			imposto = 0.25 * rendaBrt + rendaBrt;
		}
		else {
			imposto = 0.30 * rendaBrt + rendaBrt;
		}
		
		return imposto;
	}

}
