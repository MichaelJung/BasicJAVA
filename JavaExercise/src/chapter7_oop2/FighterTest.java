/**
 * EUNSOO: 2:54:48 AM/Apr 14, 2015/2015
 * TODO:
 */
package chapter7_oop2;

/**
 * @author EUNSOO
 *
 */
class FighterTest {
	public static void main(String args[]) {
		
		Fighter f = new Fighter();
		
		if (f instanceof Unit){
			System.out.println("f는  Unit class의 자손");
		}
		
		if(f instanceof Fightable) {
			System.out.println("f is implement Fightable interface.");
		}
		
		if(f instanceof Movable) {
			System.out.println("f is implement Movable interface.");
		}
		
		if(f instanceof Attackable) {
			System.out.println("f is implement Attackable interface.");
		}
		
		if(f instanceof Object) {
			System.out.println("f is descendent of Object class.");
		}
	}
}
class Fighter extends Unit implements Fightable {
	public void move(int x, int y){ }
	public void attack(Unit u){ }
}

class Unit {
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable {}

interface Movable {
	void move(int x, int y); 
}

interface Attackable {
	void attack(Unit u);
}