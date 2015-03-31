/**
 * EUNSOO: 11:19:48 PM/Mar 16, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class DeckTest {
	
	public static void main(String[] args) {
		Deck d = new Deck(); // 카드 한 벌(Deck)을 만든다.
		Card c = d.pick(0);	// 섞기 전에 제일 위의 카드를 뽑니다.
		
		System.out.println(c);
		
		d.shuffle(); 		// 카드를 섞는다.
		
		c = d.pick(0);
		System.out.println(c);
	}

}

// Class Deck
class Deck {
	
	final int CARD_NUM = 52;		// 카드의 개수
	Card c[] = new Card[CARD_NUM];
	
	Deck() { // Deck의 카드를 초기화 한다.
		int i = 0;
		for(int k = Card.KIND_MAX; k>0; k--){
			for(int n=1; n< Card.NUM_MAX + 1; n++){
				c[i++] = new Card(k, n);
			}
		}
	}
	Card pick(int index) { // 지정된 위치(index)에 있는 카드 하나를 선택한다.
		if(0 <= index && index < CARD_NUM)
			return c[index];
		else
			return pick();
	}
	
	Card pick() { 		 // Deck에서 카드하나를 선택한다.
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	void shuffle(){ 		// 카드의 순서를 섞는다.
		for(int n=0; n<1000; n++){
			int i = (int)(Math.random()*CARD_NUM);
			Card temp = c[0];
			c[0] = c[i];
			c[i] = temp;
		}
	}
	
}

// Class Card
class Card{
	static final int KIND_MAX = 4;		// 카드 무늬 수
	static final int NUM_MAX = 13;		// 무늬별 카드 수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card() {
		this(SPADE, 1);
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String kind = "";
		String number = "";
		
		switch(this.kind) {
			case 4 :
				kind = "SPADE";
				break;
			case 3 :
				kind = "DIAMOND";
				break;
			case 2 :
				kind = "HEART";
			case 1 :
				kind = "CLOVER";
				break;
			default :
		}
		
		switch(this.number){
		case 13 :
			number = "k";
			break;
		case 12 :
			number = "Q";
			break;
		case 11 :
			number = "J";
			break;
			default :
				number = this.number + "";
		}
		
		return "kind : " + kind + ", number : " + number; 
	} 	// End of toString()
	
}	// End of Card Class