/**
 * EUNSOO: 1:09:26 AM/Apr 22, 2015/2015
 * TODO:
 */
package chapter7_oop2;
import java.io.*;
/**
 * @author EUNSOO
 *
 */
class ExceptionEx21 {
	public static void main(String[] args) {
		// command line에서 입력받은 값을 이름으로 갖는 파일을 생성
		File f = createFile(args[0]);
		System.out.println(f.getName() + "created file !");
	}

	static File createFile(String fileName) {
		try {
			if (fileName==null || fileName.equals("")) throw new Exception("invalid fieName !");
		}catch (Exception e){
			// file Name이 부적적한 경우, 파일 이름을 '제목없음.txt'로 한다.
			fileName = "NoTitle.txt";
		} finally {
			// File 클래스의 객체를 생성
			File f = new File(fileName);
			// 생성된 객체를 이용해서 파일 생성
			createNewFile(f);
			return f;
		}
	}
	static void createNewFile(File f) {
		try {
			// 파일을 생성
			f.createNewFile();
		}catch(Exception e){}
	}
}
