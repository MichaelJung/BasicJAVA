/**
 * EUNSOO: 2:39:30 AM/Apr 20, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
public class FinallyTest3 {
	public static void main(String args[]){
		// method()은 static method이므로 instance 생성없이 직접 호출이 가능
		FinallyTest3.method1();
		System.out.println("Method1()수행을 마치고, main method로 돌아옴 !");
	}
	
	static void method1() {
		try {
			System.out.println("Method1이 호출 !!!");
			return;									// 현재 실행중인 method를 종료 !
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()의 finally block이 실행 !!");
		}
	}

}
