package ex14_interface;

public class MainClass {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo(10);           // = 총 animal은 10개까지 가능하다는 말. 지금 아래는 3개만 한거. 
		
		zoo.addAnimal(new Lion());
		zoo.addAnimal(new Eagle());
		zoo.addAnimal(new Shark());
		
		zoo.info();
		
		

	}

}
