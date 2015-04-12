/**
 * EUNSOO: 10:51:33 PM/Apr 10, 2015/2015
 * TODO: Casting Test 2
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class CastingTest2 {
	
	public static void main(String args[]) {
		
		// Car car = new Car();
		Car car = new FireEngine();
		
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine) car;
		
		fe.drive();
		
		car2 = fe;
		car2.drive();
	}
}
