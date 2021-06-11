package assetMgmt;

public class Computer extends TangibleAsset{

	private String name;
	private int price;
	private String color;
	private String makerName;
	
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
	public String getIsbn() {
		return makerName;
	}
	public void setIsbn(String isbn) {
		this.makerName = isbn;
	}
	public Computer(String name, int price, String color, String makerName, String dept) {
		super(name, price, color, dept);
		this.makerName = makerName;
	}
	@Override
	public void setDept(double Dept) {
		// TODO Auto-generated method stub
		
	}
	
}
