package draw;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle(5, 10, 60, 90);  //100번지
		Rectangle box2 = box;  //100번지를 그대로 가져옴
		box.translate(100, 100);
		System.out.println("box: " + box.getX());  //105
		System.out.println("box2: " + box2.getX());  //105

		// class는 모두 주소를 참조한다. 객체object는 value가 아닌 reference를 저장한다.
		// box의 속성을 변경한 뒤 box2의 속성을 변경하면
		// box의 속성을 확인했을때 box2로 변경한 속성이 저장되어있다.
		// String을 생각하면 쉽다.
		
		
		String greeting = "Hello, world!";
		String greeting2 = greeting;
		greeting2.toUpperCase();				// 여기까지는 주소가 같음
		greeting2 = greeting2.toUpperCase();  	// return 하면서 새로운 주소를 생성함(new가 생략됨)
		System.out.println(greeting);
		System.out.println(greeting2);
		
	}

}
