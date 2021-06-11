package assetMgmt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Computer computer = new Computer (null, 0, null, null);
//		TangibleAsset ta = computer;
//		TangibleAsset ta1 = new Computer (null, 0, null, null);
//		Thing thing = new Computer (null, 0, null, null);
//		Thing thing1 = ta;
//		System.out.println(computer);
//		System.out.println(ta1);
//		System.out.println(thing1);
		
		Book book = new Book ("이것이 자바다", 30000, "white", "9788968481475", "1001");
		System.out.println(book.toString());
		
		
	}

}
