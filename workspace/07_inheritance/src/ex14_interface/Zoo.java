package ex14_interface;

public class Zoo {

	// field
	private Animal[] animals;    // 모든 통물을 한곳에 모아둘 수 있는 배열을 준비한다.
	private int idx;
 	
	// constructor
	public Zoo(int animalCount) {
		animals = new Animal[animalCount];
	}
	
	// method
	public void addAnimal(Animal animal) {
		if (idx < animals.length) {
		animals[idx++] = animal;
	 }
	
   }	
	public void info() {
		for (Animal animal : animals) {
			if (animal != null) {        // exception point(=출력창에 빨간 에러) 가 떨어질 수 있기 때문에 널인지 널값이 아닌지는 항상 확인을 해줘야 한다. 
				animal.move();
			}
		}
 	}
	
}
