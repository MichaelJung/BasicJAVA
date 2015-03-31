/**
 * 
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */

class Tv1 {
	boolean power; // power on/off
	int channel; 	// channel
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}
	
	class CaptionTv extends Tv1 {
		boolean caption;						// caption status on/off
		void displayCaption(String text) {		// if (caption status = on(true)) --> show text
			if (caption) {
				System.out.println(text);
			}
		}
	}
class CaptionTvTest {
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;					// 조상 클래스로부터 상속받은 멤버
		ctv.channelUp();					// 조상 클래스로부터 상속받은 멤버
		
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World");
		ctv.caption = true;						// caption on	
		ctv.displayCaption("Hello, World2");	// display on screen
		
	}
}
