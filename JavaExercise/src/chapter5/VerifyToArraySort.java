/**
 * EUNSOO: 9:14:51 PM/Mar 26, 2015/2015
 * TODO: P4 (30 points)
 * Write the java code for the method
 * static boolean isSorted(int[] a)
 * which returns true if the array a is in sorted in ascending order. The code must run in O(n) time.
 */
package chapter5;

/**
 * @author Eunsoo Jung 1806899
 */
class VerifyToArraySort {
	
	static boolean isSorted(int[] a) {
		
		boolean rs = true;
		
		for (int i = 0; i<a.length-1; i++) {
			
			if (a[i] > a[i+1])
				
			rs = false;
		}
		
		return rs;
	}
	
	public static void main(String[] args) {
		
		int[] array1 = new int[10];
		
		for (int i=0; i < array1.length; i++){
			
			System.out.print(array1[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		int[] array2 = new int[] {1, 2, 3, 4, 5};
		
		System.out.println("array1 sorted result(rs) is " + isSorted(array1));

		System.out.println("array2 sorted result(rs) is " + isSorted(array2));
	}

}
