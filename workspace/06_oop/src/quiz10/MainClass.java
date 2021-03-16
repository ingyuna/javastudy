package quiz10;

public class MainClass {

	public static void main(String[] args) {
		
		
		String[] names = { "브레드", "짱구", "타요", "띠띠뽀", "자두" };
		Lecture lecture = new Lecture("스프링프레임워크", names);
		
		lecture.exam(3);  // 3과목의 시험을 봅니다. setScores()가 호출됩니다.
		lecture.info();  // 학생 정보 출력 + 강좌 전체 평균 
		
		

	}

}
