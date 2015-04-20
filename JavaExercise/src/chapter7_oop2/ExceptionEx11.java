/**
 * EUNSOO: 1:58:31 AM/Apr 20, 2015/2015
 * TODO: try...2 catch statements
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class ExceptionEx11 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true!");
				System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception e");
		}
		
		System.out.println(6);
	}

}
