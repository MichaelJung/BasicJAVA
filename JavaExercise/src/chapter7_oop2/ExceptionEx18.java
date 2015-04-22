/**
 * EUNSOO: 12:56:04 AM/Apr 22, 2015/2015
 * TODO: ExceptionEx18
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
public class ExceptionEx18 {
	public static void main(String args[]) throws Exception {
		method1();				// 같은 클래스내의 static member이므로 객체생성 없이 직접 호출 가능
	}
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}
}
