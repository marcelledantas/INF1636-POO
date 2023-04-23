package cap5;


/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 23 de abr de 2023
 */
public class EX0503
{
	public static void main(String[] args) {
		Contribuinte []lst;
		// obtenha a lista de contribuintes 
		lst = Contribuinte.listaContr();
		System.out.printf("NOME IMPOSTO\n");
		System.out.printf("==================== =======\n\n");
		
		for(int i = 0; i < lst.length; i++)
		{
		// o printf a seguir deve exibir o nome e o
		// imposto que o contribuinte irá pagar
		System.out.printf("%-20s %9.2f\n", lst[i].nome, lst[i].rendaBrt + lst[i].calcImposto());
		
		}
		
	}

	
}
