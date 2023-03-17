package dokojava10;

public class PoisonMatango extends Matango {
	int poison = 5;
	
	public PoisonMatango (char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
		if (this.poison > 0) {
			System.out.println("さらに毒の胞子をばらまいた");
			int dmg = h.hp/5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ");
			this.poison--; 
		}
	}
}
