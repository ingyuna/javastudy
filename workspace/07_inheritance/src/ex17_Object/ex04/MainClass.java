package ex17_Object.ex04;

public class MainClass {

	public static void main(String[] args) {   // args = 인수, 매개변수
		
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.setModel("CA-001");
		p1.setManufacturer("bio");
		p1.setDate("2020-03-01");    // 날짜는 년, 월, 일 이런 한글 안씀. 하이픈 아니면 슬래쉬. 데이터베이스에 넣었을때 문제가 없기때문에
		
		p2.setModel("CA-001");
		p2.setManufacturer("bio");
		p2.setDate("2020-03-05");
		
		// 같은 종류의 제품(model, manufacturer가 모두 같은 경우)
		// 제품은 2개(독립적인 제품) 
		
		// Object의 equals() 메소드는 객체의 데이터를 비교하지 않고, 
		// 같은 주소에 저장된 객체인지 다른 객체인지 비교합니다. 
		
		if (p1.equals(p2)) {   // product에 equals를 쓴 적이 없는데 여기선 어떻게 사용되는걸까? 바로 Object라고 하는 클래스가 가지고 있는 메소드이기때문.
			System.out.println("같은 종류의 제품입니다.");
		} else {
			System.out.println("다른 종류의 제품입니다.");    // -> 처음에는 이 결과가 나오는데, 자바 입장에서는 p1, p2 각각의 새로운 객체가 만들어졌으니 다른 객체라고 보는거. 
		}                                                     // Product에서 override 해준 후, 두번째에는 "같은 종류의 제품입니다"라고 나온다. 
		
		// -> 저 Object는 p1과p2의 내용에는 관심이 없다. p1과 p2의 새로운 객체에만 관심이 있음. 
		
	
		
	}

}
