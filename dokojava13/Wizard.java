package dokojava13;

public class Wizard {
	  private int hp;
	  private int mp;
	  private String name;
	  private Wand wand;
	  void heal(Hero h) {
	    int basePoint = 10;                                   // 基本回復ポイント
	    int recovPoint = (int)(basePoint * this.wand.getPower());  // 杖による増幅
	    h.setHp(h.getHp() + recovPoint);                      // 勇者のHPを回復する
	    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	  }
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if(hp<0)
			this.hp = 0;
		else
		    this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		if(mp < 0)
			throw new IllegalArgumentException("異常");
		else
			this.mp = mp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() <= 3)
			this.name = name;
		else {
			throw new IllegalArgumentException("3文字以上");
		}
	}
	public Wand getWand() {
		return wand;
	}
	public void setWand(Wand wand) {
		this.wand = wand;
	}
}
