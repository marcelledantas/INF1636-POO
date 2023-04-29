package cap5;


/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 28 de abr de 2023
 */
public class StaticAndInitializerBlock
{
	static {
        System.out.println("Static block executed");
    }
    
    {
        System.out.println("Instance initializer block executed");
    }
    
    public StaticAndInitializerBlock() {
        System.out.println("Constructor executed");
    }

	/**
	 * <p></p>
	 * @param args
	 */
	public static void main( String[] args )
	{
		StaticAndInitializerBlock obj1 = new StaticAndInitializerBlock();
		StaticAndInitializerBlock obj2 = new StaticAndInitializerBlock();
		C1 objC1 = new C1();
		C1 objC2 = new C1();

	}

}
