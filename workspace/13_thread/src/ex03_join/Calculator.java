package ex03_join;

public class Calculator extends Thread {

	// field
	private int from;
	private int to;
	private int result;
	
	
	// method
	@Override
	public void run() {  // 함부로 run(int from, int to)로 바꾸면 안된다. 그래서 int from int to를 불러와야 해서 아래 addition()을 써준다.
		addition();
	}
	public void addition() {
		// from부터 to까지 모든 정수 더해서 result에 저장
		if (from > to) {    // 값이 from이 더 작아야 하는데, 큰 숫자가 오면 from과 to를 바꿔서 실행을 할 수 있도록 함.  
			int temp = from;
			from = to;
			to = temp;
		}
		for (int n = from; n <= to; n++) {
			result += n;
		}
	}

	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}

	
	
	
	
}
