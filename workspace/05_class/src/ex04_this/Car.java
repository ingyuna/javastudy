package ex04_this;

/*
   this
   1. this는 객체자신을 의미한다.
   2. 어떤 클래스 내부에서만 사용합니다.
   3. 활용
   	  1) this.필드     (가장 주된 활용)
   	  2) this() 	   (다른 생성자를 호출하는 것을 의미)
   	  
   	  
*/   	  

public class Car {

	// field
	String model;
	String manufacturer;
	int price;
	
	// method
	void set(String model, String manufacturer, int price) {
		this.model = model;       // this.model = String model; (=필드값의 String model;)
		this.manufacturer = manufacturer;     // model = String model
		this.price = price;
	}
	
	void info() {
		System.out.println("모델명: " + model);
		System.out.println("제조사: " + manufacturer);
		System.out.println("가격:" + price + "만원");
		// Info에 this라고 하지 않은 이유 모델이라고 하면 필드 모델밖에 없기때문에(=이름이 충돌되지 않기때문에)
	}
		
}
	

