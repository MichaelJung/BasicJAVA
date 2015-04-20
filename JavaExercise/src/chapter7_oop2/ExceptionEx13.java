/**
 * EUNSOO: 2:10:51 AM/Apr 20, 2015/2015
 * TODO:
 */
package chapter7_oop2;

import java.io.*;

/**
 * @author EUNSOO
 *
 */
public class ExceptionEx13 {
	public static void main(String args[]){
		PrintStream ps = null;
		try {
			ps = new PrintStream("error.log");
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(Exception ae) {
			ae.printStackTrace(ps);
			ps.println("Exception Message: " + ae.getMessage());
		}
		System.out.println(6);
	}

}
