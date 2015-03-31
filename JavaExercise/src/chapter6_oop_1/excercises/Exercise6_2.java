/**
 * 문제 6-1에서 정의한 SutdaCard 클래스에 두 개의 생성자와 
 * info()를 추가해서 실행결과의 같은 결과를 얻도록 하시오.
 */
package chapter6_oop_1.excercises;

/**
 * @author EUNSOO
 *
 */
class Exercise6_2 {
	
	public static void main(String args[]) {
		
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info()); // 3
		System.out.println(card2.info()); // 1K
	}

}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true); // SutdaCard(1, true)를 호출
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() { // 숫자를 문자열로 반환, 광인 경우 K를 덧 붙인다.
		return num + (isKwang? "K" : "");
	}
	
}