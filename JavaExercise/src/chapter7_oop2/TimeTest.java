/**
 * EUNSOO: 3:54:15 AM/Mar 24, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
public class TimeTest {

	public static void main(String[] args){
		Time t = new Time(12, 35, 30);
		System.out.println(t);
		System.out.print(t);
		// t.hour = 13; error ! 변수 hour의 접근 제어자가 private 이므로 접근할 수 없다.
		t.setHour(t.getHour()+1);          // 현재 시간 보다 한시간 후로 변경
		System.out.println(t);
	}
}

class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0||hour>23) return;
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0||minute>59)
			return;
		this.minute = minute;
	}
	
	public int getSecond() { return second; }
	public void setSecond(int second) {
		if(second<0||second>59) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
