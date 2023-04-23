package cap5;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 23 de abr de 2023
 */
public class Main
{

	/**
	 * <p>
	 * </p>
	 *
	 * @param args
	 */
	public static void main( final String[] args )
	{
		final C v = new C1();
		System.out.println( v.executa( 5 ));
	}

}

/*
 * C v = new C1(), como C1 extende C, o construtor de C1 irá chamar o construtor default de C que é a superclass, 
 * e depois irá executar o construtor de C1.
 * 
 * 1. Uma instância de C1 é criada e passa a ser referenciada pela variável v;
2. O construtor de C1 é acionado, que, por sua vez, aciona o construtor da superclasse (C);
3. O construtor de C é executado. Os valores das variáveis passam a ser v1=20, v2=40 e s1=40;
4. O construtor de C1 é executado. Os valores das variáveis passam a ser v1=10, v2=10 e s1=50;
5. O método executa() é executado por meio do comando v.executa(5);
6. Como não há sobrescrita de método estático, o método ms1() executado é o que foi 
definido na classe C1, onde também está definido o método executa(), de onde foi feita a 
chamada do método ms1();
7. O valor de s1 passa a ser 50+2*5=60;
8. O método retorna() é chamado por meio do comando return retorna(b);
9. O método retorna(), definido na classe C, é executado;
10. O método calcula() é executado por meio do comando return v1+v2+s1+calcula(b);
11. Como o objeto corrente (this) é da classe C1, o método calcula(), sobrescrito em C1, é 
executado;
12. O método calcula() retorna 5+10=15;
13. O método retorna() retorna o valor 10+10+60+15=95;
14. O valor 95 é exibido no console
 * 
 */
