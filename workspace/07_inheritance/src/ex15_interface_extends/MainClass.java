package ex15_interface_extends;

public class MainClass {

	public static void main(String[] args) {
		
		// 1. Phone타입의 smartphone
		Phone phone1 = new SmartPhone();
		phone1.sendCall();
		((Computable)phone1).playApp();                        // 괄호 두개 이유 : 캐스팅이 먼저 진행되야 하기 때문에.

		// 2. Computable 타입의 smartphone
		Computable phone2 = new SmartPhone();
		((Phone)phone2).sendCall();
		phone2.playApp();
		
		// 3. SmartPhone타입의 smartphone
		SmartPhone phone3 = new SmartPhone();
		phone3.sendCall();
		phone3.playApp();
		
		  							// 1,2,3번 다 알고 있어야한다. 3번만 써야지는 노노. 
		
		
		
	}

}
