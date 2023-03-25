package dokojava13;

public class Wand {
	private String name;
	private double power;
	
	public String getName() {
		return this.name;
	}
	public double getPower() {
		return this.power;
	}
	public void setName(String name) {
		if(name.length() <= 3)
			this.name = name;
		else {
			throw new IllegalArgumentException("3文字以上");
		}
	}
	public void setPower(double power) {
		if(0.5<=power && power>=100)
			this.power = power;
		else {
			throw new IllegalArgumentException("0.5以上１００以下");
		}
	}

}
