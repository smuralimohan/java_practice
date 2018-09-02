package InterfacesAndInheritance;

/**
 * @author murmohan
 *
 */
public class MultImpl implements Interface1, Interface2{
	
	
	@Override
	public void method() {
		Interface1.super.method();
		
	};
	public static void main(String... args){

		System.out.println("numero = " + numero2);
		System.out.println("numero = " + numero);
	}

}
