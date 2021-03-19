package quiz05;

public class Bunker extends Terran {

	// field
	private Terran[] terrans;
	private int idx;
	
	// constructor 
	public Bunker() {
		terrans = new Terran[10];
	}
	
	
	// method 
	public void add(Bunkable terran) {        // add(Terran terran) { 여기에서 저걸로 바꿈. 
		if (idx < terrans.length) {
			terrans[idx++] = (Terran)terran;
		}
	}
}
