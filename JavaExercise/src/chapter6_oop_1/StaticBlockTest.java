/**
 * 예제 6-23 
 */
package chapter6_oop_1;

/**
 * @author EUNSOO
 * instance 변수의 복잡한 초기화는 constructor or instance 초기화 블럭을 사용
 */
class StaticBlockTest {
	
	static int[] arr = new int[10];
	
	static {
		for(int i = 0; i<arr.length; i++){
		
		arr[i] = (int)(Math.random() * 10) + 1; // 1과 10사이의 임의의 값을 배열 arr에 저장
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"] :" + arr[i]);
	}

}
