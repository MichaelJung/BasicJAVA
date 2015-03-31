/*
 * EUNSOO: 3:19:53 AM/Mar 18, 2015/2015
 * TODO: super method
 *  - 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수
 *  - 상속받은 멤버와 자신의 클래스에 정의된 멤버의 이름이 같을 때는 super를 사용해서 구별
 *  - 자손 클래스에서 super 대신 this를 사용할 수 있으나, 조상의 클래스의 멤버와 자손클래스의 멤버가
 *    중복 정의되어 서를 구별해야하는 경우에만 super를 사용하는 것이 좋다.
 *  - 모든 인스턴스 메소드에는 자신이 속한 인스턴스의 주소가 지역변수로 저장, 참조 변수인 this와 super의 값이 됨
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
public class SuperTest {
	public static void main(String arg[]) {
		Child c = new Child();
		c.method();
	}
}


class Parent {
	int x=10;
}

class Child extends Parent {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("surper.x=" + super.x);
	}
}