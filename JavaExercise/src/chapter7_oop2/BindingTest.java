/**
 * EUNSOO: 11:12:14 PM/Apr 10, 2015/2015
 * TODO: 참조변수와 인스턴스의 연결
 * 참조변수의 타입에 영향을 받지 않는 것은 instance method뿐
 * 멤버 변수가 조상 클래스와 자손 클래스에 중복으로 정의된 경우, 조상 타입의 참조변수를 사용했을 때는 조상 클래스에 선언된 멤버변수가 사용되고, 
 * 자손타입의 참조변수를 사용했을 때는 자손 클래스에 선언된 멤버 변수가 사용된다.
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class BindingTest {
	public static void main(String args[]) {
		Parent3 p = new Child3();
		Child3 c = new Child3();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent3 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent3 {
	int x = 200;
	
	void method() {
		System.out.println("Child2 Method");
	}
}
