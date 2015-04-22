/**
 * EUNSOO: 1:05:20 AM/Apr 22, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
public class ExceptionEx20 {
	public static void main(String args[]) {
		try {
			method1();
		} catch(Exception e) {
			System.out.println("method 내에서 예외처리");
			e.printStackTrace();
		}
	}
	static void method1() throws Exception {
		throw new Exception();
	}
}
