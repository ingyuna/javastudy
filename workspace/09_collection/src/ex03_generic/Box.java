package ex03_generic;

public class Box<T> {

	// field
	private T[] items;
					// private T[] items = new T[10];    
					// -> 말이 안되는 이유 : 자바는 이렇게 Box<String> box = new Box<>(); 이렇게 하기전까지는 String인지 무슨 타입인지 모른다.
					// compile time -> run time 
					// T가 10개 있다는데 난 지금 T가 뭔지 몰랑,,, 메모리 공간을 잡을 수 없어서 이 코드는 불가능. 
					// => 구체적인 종류를 미리 알 수 없어서 안됨. 
					// -> 이걸 해결하려면, new Object[10]; 이렇게 해주면 됨.
					// 구체화 시점에 어떤게 전달될지 모르면, 뭐가 저장될지 모른다고 판단할 수 밖에 없음.
					// 그래서 무엇이든지 저장할 수 있는 공간인 Object로 만들어주는거다.
	private int idx;
	
	// constructor
	public Box(int itemCount) {
		// items = new T[itemCount];  코드 작성 시점에는 T의 구체적인 종류를 알 수 없어서, 메모리 할당이 불가능합니다.
		items = (T[])(new Object[itemCount]);		// Object 배열 생성 뒤에는 캐스팅을 해줘야 합니다.
					// -> 노란줄 그어지는거는 Object를 어떻게 T타입에 넣냐,,하는건데 신경 안써도 된당. 
	}
		
	// method
	public void addItem(T item) {   // 받아오는 타입을 T로 잡아준다. => T타입에 item이 온다.
		if (idx == items.length) {
			System.out.println("Full");
			return;
		}
		items[idx++] = item;
	}
	@Override
	public String toString() {
		String result = "";
		for (T item : items) {
			if (item != null) {
				result += item.toString();	 // item.toString -> Fruit의 toString()  => "Fruit [name=" + name + ", price=" + price + "]";
			}
		}
		return result;	
	}
	
	
	
}
