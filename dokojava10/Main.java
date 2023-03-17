package dokojava10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		PoisonMatango m = new PoisonMatango('A');
		m.attack(h);
		System.out.println(h.name + "は" + h.hp + "になった");

	}

}
