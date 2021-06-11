package assetMgmt;

public class Book extends TangibleAsset{
	private String isbn;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Book(String name, int price, String color, String isbn, String dept) {
		super(name, price, color, dept);
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Book [isbn=" + isbn + "]";
	}
	
}
