/**
 * EUNSOO: 1:50:50 AM/Apr 20, 2015/2015
 * TODO: ExceptionEx7-8
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class ExceptionEx7 {
	public static void main(String agrs[]) {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Exception 발생 !!!");
		}
		
	}
}
