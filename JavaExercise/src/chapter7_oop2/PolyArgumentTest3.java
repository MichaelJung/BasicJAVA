/**
 * EUNSOO: 2:18:05 AM/Apr 12, 2015/2015
 * TODO: Vector Class를 하여 동적으로 크기를 관리하는 객체배열에 대해 공부한다.
 * - Vector(): declare vector
 * - boolean add(Object o): add object to vector
 * - boolean remove(Object o)
 * - boolean isEmpty()
 * - Object get(int index)
 * - int size()
 */

package chapter7_oop2;

import java.util.*;
/**
 * @author EUNSOO
 *
 */
class Product7 {
	int price;
	int bonusPoint;
	
	Product7(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product7() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv7 extends Product7 {
	Tv7() {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer7 extends Product7 {
	Computer7() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio7 extends Product7 {
	Audio7(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer7 {
	int money = 1000;
	int bonusPoint = 0;
	Vector<Product7> item = new Vector<Product7>();				// 구입한 제품을 저장하기위해  사용될 Vector Object
	
	void buy(Product7 p){
		if(money < p.price) {
			System.out.println("잔액 부족 !!!");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);						// add product in vector
		System.out.println(p + ": 구매완료 !!!!!");
	}
	
	void refund(Product7 p){				// refund products
		if(item.remove(p)){
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + ": 반품완료");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {			// check the vector is empty.
			System.out.println("You don't buy Products !");
			return;
		}
		for(int i=0; i<item.size(); i++) {
			Product7 p = (Product7)item.get(i);			// Vector의 i번째 있는 객체를 얻어온다.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("Total Price: " + sum);
		System.out.println("Remain Money: " + money);
		System.out.println("Lists of bought products: "+ itemList);
	}
}

class PolyArgumentTest3 {
	public static void main(String args[]) {
		Buyer7 b = new Buyer7();
		Tv7 tv = new Tv7();
		Computer7 com = new Computer7();
		Audio7 audio = new Audio7();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.refund(audio);
		b.refund(audio);
//		b.refund(tv);
		b.summary();
	}
	
}
