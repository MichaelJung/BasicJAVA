/**
 * EUNSOO: 1:02:09 AM/Apr 22, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
public class ExceptionEx19 {
	public static void main(String args[]) {
		method1();
	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1 method에서 예외 처리 !");
			e.printStackTrace();
		}
	}

}
