/**
 * 예제 6-24
 */
package chapter6_oop_1;

/**
 * @author EUNSOO
 * serial Number 자동 부여 구현
 */
class Product {
	static int count = 0; 	// 생성된 instance의 수를 저장하기 위한 변수
	int serialNo;			// instance 고유의 번호
	{
		++count; 			// Product instance가 생성될 때 마다 count의 
		serialNo = count;	// 값을 1씩 증가시켜서 serialNo에 저장
	}
	public Product() {}
	
}

class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품 번호 (serial no)는 " + p1.serialNo);
		System.out.println("p1의 제품 번호 (serial no)는 " + p2.serialNo);
		System.out.println("p1의 제품 번호 (serial no)는 " + p3.serialNo);
		
		System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
	}
}
