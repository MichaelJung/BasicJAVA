/**
 * 
 */
package chapter4;

/**
 * @author EUNSOO
 *
 */
public class FlowEx23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int i = 0;
		
		while(sum + i <= 100) {
			sum += ++i; // sum = sum + ++i;
			System.out.println(i+ " - " + sum);
		}

	}

}
