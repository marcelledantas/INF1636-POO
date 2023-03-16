package cap3;

/**
 * <p>
 * </p>
 * 
 * @author imarc
 * @version 1.0 Created on 16 de mar de 2023
 */
public class Xpto
{

	public static int contInst;

	public Xpto()
	{
		contInst++;
	}

	public static int getQtdInst()
	{
		return contInst;
	}
}
