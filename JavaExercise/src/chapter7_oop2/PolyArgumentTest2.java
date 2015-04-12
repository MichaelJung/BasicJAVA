/**
 * EUNSOO: 1:22:06 AM/Apr 12, 2015/2015
 * TODO: 조상타입의 참조변수 배열을 사용하여, 공통 조상을 가진 서로 다른 종류의 객체를 묶어서 배열화거나
 * 묶어서 다루고자 하는 객체들의 상속관계를 따져서 가장 가까운 공통 조상 클래스 타입의 참조변수 배열을 생성해서 객체를 저장
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class Product5 {
	int price;
	int bonusPoint;
	
	Product5(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product5() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv5 extends Product5 {
	Tv5() {
		super(100);			// 조상클래스의 생성자  Product(int price)를 호출한다.
	}
	public String toString() {
		return "Tv";
	}
}
class Computer5 extends Product5 {
	Computer5() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product5 {
	Audio() {
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer5 {
	int money = 1000;
	int bonusPoint = 0;
	Product5[] item = new Product5[10];		// 구입한 제품을 배열하기 위한 배열을 선언
	int i = 0;								// Product 배열에 사용될 카운터

	void buy(Product5 p) {
		if(money < p.price) {
			System.out.println("잔액부족 !");
			return;
		}
		
		money -= p.price; 				// 현재 보유한 금액에서 구입한 제품 가격을 가감
		bonusPoint += p.bonusPoint;		// 제품의 보너스 점수를 추가
		item[i++] = p;					// 제품을 Product[] item에 저장
		System.out.println(p + "구매완료 !");
	}
	
	void summary() {			// 구매물품에 대한 요약 정보
		int sum = 0;			// 구입한 물품의 가격합계
		String itemList = "";	// 구입한 물품 목록
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for (int i=0; i < item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
//			itemList += item[i] + ", ";
			itemList += (i==0) ? "" + item[i]: ", " + item[i]; 
		}
		
		System.out.println("구매 물품 총 금액: " + sum + "만원");
		System.out.println("잔액: " + money + "만원");
		System.out.println("구입 제품: " + itemList);
	}
}

class PolyArgumentTest2 {
	public static void main(String args[]) {
		Buyer5 b = new Buyer5();
		Tv5 tv = new Tv5();
		Computer5 com = new Computer5();
		Audio audio = new Audio();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
	}
}
