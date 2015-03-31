package chapter4;

public class Ex4_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		for (int i=0; i<=10; i++){
			for (int j = 0; j <=i; j++) 
				System.out.println("+");
		}
		*/
		int i = 0;
		while(i <=10) {
			i++;
			int j = 0;
			while(j <=i){
				j++;
				System.out.println("-");
			}
			
		}
	}

}
