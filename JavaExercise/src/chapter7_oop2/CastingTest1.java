/**
 * EUNSOO: 3:40:30 AM/Mar 31, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class CastingTest1 {
	public static void main(String[] args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		// car.water(); compile error: Car type의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine) car; 		// type child <-- type parent
		fe2.water();
		
	}

}

class Car {
	String color;
	int door;
	
	// 운전하는 기능
	void drive() {
		System.out.println("drive, Brrrr~~~ ");
	}
	
	void stop() {
		System.out.println("Stop !!! ");
	}
}

class FireEngine extends Car {		 // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water1 !!! ");
	}
}