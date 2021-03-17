package ex06_override;

public class MainClass {

	public static void main(String[] args) {
		
		Coffee coffee = new Coffee("콜롬비아");
		coffee.taste();
		
		Espresso espresso = new Espresso("인도네시아", 30);
		espresso.taste(); 
		                        // 이렇게 동일한 코드가 다른 기능을 하는것을 '다형성'이라고 한다. 
		
		
		
	}

}
