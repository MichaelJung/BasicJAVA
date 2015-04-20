/**
 * EUNSOO: 2:32:36 AM/Apr 20, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
public class FinallyTest {
	public static void main(String args[]) {
		try {
			startInstall();		// 프로그램 설치 준비
			copyFiles();		// 파일복사

		} catch (Exception e) {
			e.printStackTrace();
		} finally {	
			deleteTempFiles(); 	// 설치시 사용된 임시파일 삭제
		}
	}
	
	static void startInstall() { 	}
	static void copyFiles() { }
	static void deleteTempFiles() { }
}
