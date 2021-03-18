package ex08_upcasting;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv(200, "LG-75");
		tv.info();    // Tv클래스의 info()를 호출
		
		Elec elec = tv;  // TV 타입의 객체를 Elec 타입으로 변경.
						 // 서브 -> 슈퍼 타입으로 변경하는 것으로 "upcasting"이라고 합니다. 
						 // upcasting은 별도 casting 문법이 없습니다.    -> 그냥 된다. 
		elec.info();    // Elec 클래스의 info()를 호출
		
		// 메소드의 호출
		// 1. 객체의 타입에 따라 결정됩니다.
		//    호출할 메소드를 결정하는 것을 "바인딩"이라고 표현합니다.
		// 2. 자바는 "동적 바인딩"입니다. 
		//    1) 메소드 호출 시점(실행 전)에는 객체의 타입을 봅니다. 
		         // Elec elec = tv; 이므로 elec.info()는 Elec의 info()입니다.  --> 이건 눈으로 직접 본것.
		//                       --> 여기 1번에서 끝나는 방식은 바뀌지 않으니까 "정적 바인딩"이라고 한다. 
		//    2) 실제 객체를 확인합니다.          --> 눈으로 보이진 않지만 내부적으로 일어나고 있는것.
		//		 Tv tv = new TV(200, "LG-75"); 이므로 tv 객체가 Tv 타입이라는 것을 확인합니다.
		//    3) 실제 객체의 타입으로 바꿔서 호출하고 실행합니다.
		//       elec.info()가 실행될때는 Tv의 info()가 호출됩니다.
		
		Elec elec2 = new Tv(300, "Samsung-85");
		elec2.info();   
		
	}

}
