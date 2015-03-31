/**
 * EUNSOO: 12:09:01 AM/Mar 17, 2015/2015
 * TODO: 자바에서는 단일 상속 만을 허용
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class Tv {
	
	boolean power; // 전원상태 (on/off)
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class VCR {
	boolean power; 		// power on/off
	int counter = 0;
	void power() { power = !power; }
	void play() { }
	void stop() { }
	void rew() {}
	void ff() {}
}

class TVCR extends Tv {
	VCR vcr = new VCR();	// VCR 클래스를 포함시켜 사용
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}