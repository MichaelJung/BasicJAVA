package chapter4;

public class FlowEx22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =2;
		while(i<9){
			int j =  1;
			while(j <=9) {
				System.out.println( i + " * " + j + " = " + i*j);
				j++;
			}
			i++;
		}// end of while(i=9)

	}

}
