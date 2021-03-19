package ex06_exception_class;

// 예외클래스는 "직렬화"를 대비해서 serialversionID를 생성하라고 항상 경고를 띄웁니다.
// "직렬화" 처리할 필요가 없다면, 경고 메시지를 무시하라는 @SuppressWarning 애너테이션을 추가합니다.



@SuppressWarnings("serial")      // -> 시리얼(직렬화) 무시해라. 앞으로 직렬화 워닝에 관해서 나한테 띄우지마. * 모든 @ 에너테이션은 자바에게 알려준다. 
public class UpDownException extends Exception {

	// 예외클래스는 주로 어떤 일을 수행하냐면,
	// 예외메시지(예외가 발생한 이유)를 저장합니다.
	
	// constructor
	public UpDownException() {
		super("1~100 사이의 값을 입력해야 합니다.");  // 예외메세지를 Exception에게 전달하면 됩니다.
	}
	
}
