/**
 * EUNSOO: 11:45:57 PM/Apr 10, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class BindingTest2 {
	public static void main(String args[]) {
		Parent7 p = new Child7();
		Child7 c = new Child7();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent7 {
	
	int x = 100;
	
	void method() {
		System.out.println("Parent Method.");
	}
}

class Child7 extends Parent7{}