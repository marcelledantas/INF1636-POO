package cap4;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 16 de mar de 2023
 */
public class EX0401
{

	/**
	 * <p>
	 * </p>
	 *
	 * @param args
	 */
	public static void main( final String[] args )
	{
		final C o = new C( 5 );
		o.exibe();
	}

}

/*
 * Perguntas: a) 1. Será chamado o contrutor da classe C 2. e esse chamará o construtor da classe B
 * 3. que chamará o construtor da classe A 4. Será executado o bloco de inicialização da classe A (x
 * = 10, y = 10) e posteriormente o construtor de A (x = 100, y = 100) 5. Após isso, será chamado o
 * construtor de B (x = 200, y = 200) 6. E por último faz uma chamada ao construtor de C passando o
 * parametro 5 (x = 205, y = 1000) b) 1 . O contrutor da classe C será chamado e chamará o
 * construtor da classe B, mas antes disso será executado o bloco de inicialização de C (x = 10, y =
 * 10 0) 2. Após isso irá ser executado o construtor de C (x = 15, y = 50 )
 */
