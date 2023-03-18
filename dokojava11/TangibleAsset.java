package dokojava11;

public abstract class TangibleAsset implements Asset{
	String name;
	int price;
	String color;
	
	public TangibleAsset(String name,int price,String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public String getName() {
		return this.name;
	}
	public int getprice(){
		return this.price;
	}
	public String color() {
		return this.color;
	}
}
