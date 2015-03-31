/**
 * 예제 6-22
 */
package chapter6_oop_1;

/**
 * @author EUNSOO
 * class 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행, 인스턴스 초기화 블럭은 인스턴스가 생성 될때 마다 수행
 */
class BlockTest {
	static {
		System.out.println("static {}");
	}
	{System.out.println(" () "); }
	
	public BlockTest() {
		System.out.println(" Constructor ");
	}
	
	public static void main(String[] args) {
		System.out.println("Block Test bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
	}
}
