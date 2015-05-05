/**
 * EUNSOO: 4:44:35 AM/May 5, 2015/2015
 * TODO:
 */
package chapter9;

/**
 * @author EUNSOO
 *
 */
public class EqualEx1 {
	
	public static void main(String args[]){
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2)) {
			System.out.println("V1 == V2");
		}else {
			System.out.println("V1 != V2");
		}
		
		v2 = v1;
		
		if (v1.equals(v2)) {
			System.out.println("v1 == v2");
		}else{
			System.out.println("v1 != v2");
		}
	}

}

class Value {
	
	int value;
	
	Value(int value) {
		this.value = value;
	}
}