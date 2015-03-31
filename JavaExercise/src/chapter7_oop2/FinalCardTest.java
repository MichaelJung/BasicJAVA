/**
 * EUNSOO: 3:30:01 AM/Mar 24, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class Card1{
	final int NUMBER;	// 상수지만 선언과 함께 초기화 하지 않고, 생성자에서 단 한번만 초기화 가능
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card1(String kind, int num){
		// 매개변수로 넘겨받은 값으로 KIND와 NUMBER를 초기화
		KIND = kind;
		NUMBER = num;
	}
	
	Card1() {
		this("HEART", 1);
	}
	
	public String toString() {
		return "" + KIND + " " + NUMBER;
	}
}


class FinalCardTest {
	public static void main(String[] args) {
		Card1 c = new Card1("HEART", 10);
//		c.NUMBER = 5; --> error ! cannot assign a value to final variable NUMBER
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}
	
}
