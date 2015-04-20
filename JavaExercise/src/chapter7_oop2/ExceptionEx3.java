/**
 * EUNSOO: 1:25:58 AM/Apr 20, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class ExceptionEx3 {
	
	public static void main(String agrs[]) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
				result = number / (int)(Math.random()*10);
				System.out.println(result);
			}catch(ArithmeticException e) {
				System.out.println("ArithmicException!");
			}
		}
	}

}
