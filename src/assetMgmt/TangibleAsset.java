package assetMgmt;

public abstract class TangibleAsset implements Thing, Asset {

	protected String name;
	protected int price;
	protected String color;
	private double weight;
	protected String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public TangibleAsset(String name, int price, String color, String dept) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.dept = dept;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "TangibleAsset [name=" + name + ", price=" + price + ", color=" + color + ", weight=" + weight
				+ ", dept=" + dept + "]";
	}


	
	
	
}