package ex05_synchronized;

public class Mama extends Thread {

	// field
	private Dyson dyson;

	// method             // -> 어떤 dyson을 쓸 건지 getter/setter가 필요하다. 
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			dyson.floorCleaning();   // 엄마는 바닥 청소 담당 
		}
	}	
	public Dyson getDyson() {
		return dyson;
	}
	public void setDyson(Dyson dyson) {
		this.dyson = dyson;
	}
	
	
	
	
}
