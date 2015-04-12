/**
 * EUNSOO: 11:00:16 PM/Apr 10, 2015/2015
 * TODO: 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof 연산자를 사용
 * 주로 조건문에 사용되며, instance의 왼쪽에는 참조변수를 오른쪽에는 타입(클래스 명)이 피연사로 위치
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class InstanceofTest {
	public static void main(String args[]) {
		FireEngine1 fe = new FireEngine1();
		
		if(fe instanceof FireEngine1) {
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car3) {
			System.out.println("This is a Car instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is a OBject instance.");
		}
	}
}

class Car3{}
class FireEngine1 extends Car3 {}