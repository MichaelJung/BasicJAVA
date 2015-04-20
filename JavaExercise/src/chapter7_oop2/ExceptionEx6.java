/**
 * EUNSOO: 1:39:44 AM/Apr 20, 2015/2015
 * TODO: 사용자 정의  Exception
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class ExceptionEx6 {
	public static void main(String args[]) {
		try {
			Exception e = new Exception("고의로 발생시킴 !");
			throw e; 		// 예외를 발생시킴
		}catch(Exception e){
			System.out.println("Error Message: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Nomally, program closed !!!!!");
	}
}
