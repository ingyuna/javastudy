package ex03_input;

import javax.swing.JOptionPane;

public class Ex02_JOptionPane {

	public static void main(String[] args) {
		
		// JOptionPane 클래스
		// 1. 패키지: javax.swing
		// 2. 메소드
		//    1) showInputDialong() : 입력 대화상자 
		//    2) showConfirmDialog() : 확인 대화상자 (진행하기 전에 물어보는것. '삭제하시겠습니까"와 같은)
		//    3) showMessageDialog() : 출력 대화상자
		//    주의) showInputDialog()는 언제나 String을 반환한다. => 정수든, 실수든 다 String으로 처리가 된다는 얘기.
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		String sAge = JOptionPane.showInputDialog("나이를 입력하세요");
		String sHeight = JOptionPane.showInputDialog("키를 입력하세요");
		String sGender = JOptionPane.showInputDialog("성별을 입력하세요");
		
		// String이 아닌 입력은 본래 타입으로 변환한다.
		int age = Integer.parseInt(sAge);
		double height = Double.parseDouble(sHeight);
		char gender = sGender.charAt(0);

		// 출력해보자.
		String message = "이름: " + name +
				         ", 나이: " + age +
				         ", 키: " + height +
				         "cm, 성별: " + gender;
		
		JOptionPane.showMessageDialog(null, message); // -> Parent 컴퍼넌트가 없기 때문에 null)
		
	}

}
