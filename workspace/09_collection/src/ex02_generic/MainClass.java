package ex02_generic;

public class MainClass {

	public static void main(String[] args) {
		
		
		Box<String, Integer> box1 = new Box<String, Integer>();  // 마찬가지로, 뒤에 new Box<String, Integer> 하나든 두개든 언제나 생략 가능.
																	// -> java ver.1.7부터 가능해짐 1.6까지는 뒤에 다 써줘야함.
		box1.setItem1("james");
		box1.setItem2(90);
		
		System.out.println(box1.getItem1() + ", " + box1.getItem2());
		
		
		Box<String, Pet> box2 = new Box<>();
		box2.setItem1("앨리스");
		box2.setItem2(new Pet("댕댕이", 2));
		System.out.println(box2.getItem1() + ", " + box2.getItem2());

	}

}
