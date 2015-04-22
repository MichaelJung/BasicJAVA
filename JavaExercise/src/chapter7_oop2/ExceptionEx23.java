/**
 * EUNSOO: 1:36:28 AM/Apr 22, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
public class ExceptionEx23 {
	public static void main(String args[]) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main method내에서 예외처리 !");
		}
	}
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1에서 예외처리 됨 !");
			throw e;
		}
	}
}
