/**
 * EUNSOO: 1:41:48 AM/Apr 22, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
public class NewExceptionTest {
	public static void main(String args[]) {
		try {
			startInstall();			// 프로그램 설치에 필요한 준비
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("Error Message: " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간 확보 후 다시 설치 해 !");
		} catch (MemoryException me) {
			System.out.println("Error Message: " + me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("설치 해 !");
		}finally{
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) throw new SpaceException("설치 공간 부족 !");
		if(!enoughMemory()) throw new MemoryException("설치 공간 부족 !");
	}
	
	static void copyFiles() {
		
	}
	
	static void deleteTempFiles() {
		
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory(){
		return true;
	}
} // Exception class의 끝.

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg){
		super(msg);
	}
}
