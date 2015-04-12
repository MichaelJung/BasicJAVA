/**
 * EUNSOO: 11:51:57 PM / Apr 10, 2015
 * TODO: 자손 클래스 Child에 선언된 인스턴스 변수 x와 조상 클래스 Parent로부터 상속받은 인스턴스 변수 x를 구분하는데 
 * 참조변수 super와 this가 사용된다. 
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class BindingTest3 {
	
	public static void main(String args[]) {
		Parent8 p = new Child8();
		Child8 c = new Child8();
		
		System.out.println("p.x = "+ p.x);
		p.method();
		System.out.println("c.x = "+ c.x);
		c.method();
	}
}

class Parent8 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method.");
	}
}

class Child8 extends Parent8 {
	int x = 20;
	
	void method() {
		System.out.println("x=" + x);  // equal to this.x
		System.out.println("super.x="+ super.x);
		System.out.println("this.x = " + this.x);
	}
}