package ex09_upcasting;

public class Coffee {   // 최상위 배치

	// field
	private String bean;    // 커피 원두

	// constructor                -> field가 있는경우엔 생성자를 만들때 언제나 using field
    public Coffee(String bean) {
    	super();
    	this.bean = bean;
}
    
    // method
    public void info() {
    	System.out.println("원두의 원산지: " + bean);
    }
    public void taste() {
    	System.out.println("원두 맛 없다.");
    }
	
	
	
	
	
}
