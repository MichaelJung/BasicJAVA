/**
 * 
 */
package chapter4;

/**
 * @author EUNSOO
 *
 */
public class FlowEx25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		
		while(true){
			if(sum > 100)
				break; // break문이 수행되면 이 부부은 실행되지 않고  while문을 완전히 벗어난다.
			++i;
			sum += i;
		} // End of while
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);

	}

}
