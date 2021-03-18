package ex08_upcasting;

public class Tv extends Elec {

	// field
	private String model;

	// constructor
	public Tv(int watt, String model) {
		super(watt);
		this.model = model;
	}
	
	// method
	@Override
	public void info() {
		System.out.println("Tv모델명: " + model);
		super.info();
	}
	
	
}
