/**
 * 
 */
package chapter4;

/**
 * @author EUNSOO
 *
 */
class FlowEx24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws java.io.IOException{
		// TODO Auto-generated method stub
		int input = 0;
		
		System.out.println("문장을 입력하세요.");
		System.out.println("입력을 마치면 x를 입력하세요.");
		
		do {
			input = System.in.read();
			System.out.print((char)input);
		} while(input != -1 && input !='x');		

	}

}
