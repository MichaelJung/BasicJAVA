/**
 * 5.5 constructor 를 이용한 instance 의 복사
 * instance 생성시 결정사항 2가지 ?
 * 1. class : 어떤 class의 instance를 생성할 것인가 ?
 * 2. constructor : 선택한 class 의 어떤 constructor 로  instance 를 생성할 것인가 ?
 */
package chapter6_oop_1;

/**
 * @author EUNSOO
 *
 */
class Car3 {
	String color;
	String gearType;
	int door;
	
	Car3() {
		this("white", "auto", 4);
	}
	Car3(Car3 c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

class CarTest3 {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);
		
		System.out.println("c1 color=" + c1.color + "c1 gearType=" + c1.gearType + "c1 door=" + c1.door);
		System.out.println("c2 color=" + c2.color + "c2 gearType=" + c2.gearType + "c1 door=" + c2.door);
		
		c1.door = 100;  // c1의 인스턴스 변수 door 값을 변경 한다.
		
		System.out.println("c1.door=100; 수행 후");
		
		System.out.println("c1 color=" + c1.color + "c1 gearType=" + c1.gearType + "c1 door=" + c1.door);
		System.out.println("c2 color=" + c2.color + "c2 gearType=" + c2.gearType + "c1 door=" + c2.door);
		
	}
}
