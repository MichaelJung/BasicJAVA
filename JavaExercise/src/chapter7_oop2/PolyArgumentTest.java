/**
 * EUNSOO: 12:06:55 AM/Apr 11, 2015/2015
 * TODO: 매개변수의 다형성
 * 참조변수의 다형적인 특징은 메서드의 매개변수에도 적용됨
 * 매서드의 매개변수에 다형성을 적용하면 매개변수가  X 타입의 참조변수라는 것은, 메서드의 매개변수로  X클래스의 자손타입의 참조변수면
 * 어느 것이나 매개변수로 받아 들일수 있다는 뜻임.
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price/10.0); // 제품가격의 10%
	}
}

class Tv3 extends Product {
	Tv3() {
		// 조상 클래스의 생성자 Product(int price)를 호출
		super(100);			// Tv의 가격을 100원으로 책정
	}
	
	public String toString() {
		// Object클래스의 toString()을 오버라이딩
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000; 		// 소유 금액
	int bonusPoint = 0;		// bonus point
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("물건 못사 ! 돈 더 가저와 !");
			return;
		}
		money -= p.price; 				// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;		// 제품의 보너스 점수를 추가
		System.out.println(p + "구입 완료 !");
	}
}

class PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		Tv3 tv = new Tv3();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		
		System.out.println("잔액 : " + b.money + "원");
		System.out.println("보너스점수 " + b.bonusPoint + "point");
	}
}
