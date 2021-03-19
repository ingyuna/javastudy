package ex06_exception_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UpDown {

	// field
	private int answer;   // 발생된 난수 
	private int count;    // 시도 횟수
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public UpDown() {
		answer = (int)(Math.random() * 100) + 1;  // 1 ~ 100 사이의 난수 발생
	}

	// method
	public int challenge() throws UpDownException, InputMismatchException {    // 원래 있던 예외는 안적어도 되고, 사용자가 만든 예외는 반드시 적어준다. 
		count++;     // 정수값 이외의 입력이 되도 카운트가 된다는말. 이미 카운트 증가로 시작하니까. 
		System.out.print("1 ~ 100 사이의 정수를 입력하세요 >>> ");
		int n = sc.nextInt();   // 입력이 int가 아니면 InputMismatchException이 발생한다.    (예외가 발생할 수 있음. 정수말고 다른걸 넣었을때.
		if (n < 1 || n > 100) {       // 1에서 100사이의 범위를 벗어나서 입력하는 해당되는 예외가 있나를 생각했을때 없다. (넘버포,아리스...다 해당이 안됨) 
										// -> 그래서 직접 만들어서 던진다.
			throw new UpDownException();
		}
		return n;
	}
	public void play() {
		while (true) {
			try { 
				int n = challenge();  // UpDwonException, InputMismatchException이 발생되는곳. 
				if (n < answer) {
					System.out.println("Up!");
				} else if (n > answer) {
					System.out.println("Down!");
				} else {
					System.out.println("정답 " + answer + "를 맞혔습니다. (" + count + "번만의 정답)");
					return;   // play() 메소드 종료 
				}
			} catch (UpDownException e) {
				System.out.println(e.getMessage());  // 1 ~ 100 사이의 값을 입력해야 합니다.
			} catch (InputMismatchException e) {
				// 정수가 아닌 값이 입력되는 경우
				// 그 값은 어디에도 저장되지 못하고 계속 입력에 남아있기 때문에 제거가 필요합니다. 
				sc.next();  // 입력 받는 변수는 없어도 됩니다. 어차피 사용이 목적이 아닙니다. 
				System.out.println(e.getMessage());  // null
			}
		}
	}
	
	
	
}
