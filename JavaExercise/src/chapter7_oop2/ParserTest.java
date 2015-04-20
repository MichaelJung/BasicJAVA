/**
 * EUNSOO: 3:38:25 AM/Apr 14, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */

interface Parseable {
	// 구문 분석 작업을 수행
	public abstract void parse(String fileName);
}

class ParserManager {
	// return type is Parseable interface
	public static Parseable getParser(String type) {
		if(type.equals("XML")){
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String filename) {
		// 구문 분석 작업을 수행하는 코드를 적는다 
		System.out.println(filename + "-XML parsing completed");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		// 구문 분석 작업을 수행하는 코드를 적는다 
		System.out.println(fileName + "-HTML Parsing completed.");
	}
}

class ParserTest {
	public static void main(String args[]) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
	
}
