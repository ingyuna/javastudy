package ex04_generic_method;

public class Calculator {

	// method
	public <T> double getTotal1(T[] a) {  //  여기 getTotal()에 int[]와 dobule[] 두 타입을 모두 넣으려면? 제너릭, 오브젝트 다 제외하면? '오버로드'해서 만들 수 있다. = getTotal()을 두 개 만들면됨.
								// 근데 우리는 generic을 배웠으니까 generic을 사용해보자.
		double total = 0;
		for (int i = 0; i < a.length; i++) {
			total += ((Number)a[i]).doubleValue();
		}
		return total;
	}

	public <T extends Number> double getTotal2(T[] a) {  // T는 Number를 상속받는 클래스만 가능합니다.
		double total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i].doubleValue();  				// getTotal2가 더 안전하게 쓸 수 있는 코드이긴 하다. -> extends Number라고 미리 해줬기때문에.
															// a[i]. 찍으면 바로 더블이 나온다. 
		}
		return total;
	}
	
}
