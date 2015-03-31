/**
 * 5.4 생성자에서 다른 생성자 호출하기  - this(), this
 * constructor(생성자)간 호출이 가능 
 * 조건 :
 * 생성자 이름으로 클래스 이름 대신  this 를 사용
 * 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능
 * 
 * this - instance 자신을 가리키는 참조 변수, 인스턴스의 주소가 저장되어 있다.
 * 		    모든 instance method 에 지역변수로 숨겨진 채로 존재
 * this(), this(parameters 매개변수) - constructor, 같은 클래스의 다른 constructor 를 호출할 때 사용
 */
package chapter6_oop_1;

/**
 * @author EUNSOO
 *
 */
class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2() {
		this("white", "auto", 4);
	}
	
	Car2(String color) {
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

class CarTest2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1 color =" + c1.color + " c1 gearType=" + c1.gearType + " c1 door=" + c1.door);
		System.out.println("c2 color =" + c2.color + " c2 gearType=" + c2.gearType + " c2 door=" + c2.door);
	}
}
