/**
 * EUNSOO: 6:31:52 AM/Apr 15, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */

class A1 {
	void autoPlay(I i) {
		i.play();
	}
}

interface I {
	public abstract void play();
}

class B1 implements I {
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements I {
	public void play() {
		System.out.println("play in C class");
	}
}
class InterfaceTest2 {
	public static void main(String args[]) {
		A1 a = new A1();
		a.autoPlay(new B1());
		a.autoPlay(new C());
	}
}
