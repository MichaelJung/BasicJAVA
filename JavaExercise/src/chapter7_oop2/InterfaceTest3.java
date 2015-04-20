/**
 * EUNSOO: 6:38:27 AM/Apr 15, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class InterfaceTest3 {
	public static void main(String args[]) {
		A3 a = new A3();
		a.methodA();
	}
}

class A3 {
	void methodA() {
		I3 i = InstanceManager.getInstance();
		i.methodB();
	}
}

interface I3 {
	public abstract void methodB();
}

class B3 implements I3 {
	public void methodB() {
		System.out.println("methodB in B class");
	}
}

class InstanceManager {
	public static I3 getInstance() {
		return new B3();
	}
}
