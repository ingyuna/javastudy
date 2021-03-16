package ex07_recursive;

public class Adder {

	private int total; // 0입니다. (=필드니까)   private int total = 0; 이런코드 넣지 말자는 얘기.너무 없어보이잖아..
	
	public void calculate(int n) {
		if (n == 0) {
			return;  // 결과타입이 void인 경우에만 return; 을 통해서 메소드를 종료합니다.
		}
		total += n;
		calculate(n - 1);     // 여기 total부터는 else로 묶어도 되고 크게 상관은 없다. 
	}

	public int getTotal() {    // 토털의 확인을 위해서는 get을 쓴다. setTotal은 쓸 일은 없지만 지울필요도 없음.
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
}
