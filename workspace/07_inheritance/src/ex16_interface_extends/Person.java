package ex16_interface_extends;

public class Person {

	// method
	// 1. Pet에게 food 주기           
	public void feed(Pet pet, String food) {
		pet.feed(food);
	}
	
	// 2. Pet과 산책하기
	public void walking(Walkable pet) {     // 이제 Snake는 walkable이 없기때문에 저장이 안된다. 그래서 컴파일 에러가 뜬다. 애초에 전달자체를 못하게 막음.     // walking(Pet pet) {
		System.out.println("Walking with " + ((Pet)pet).getName());
	}
	
	
	
}
