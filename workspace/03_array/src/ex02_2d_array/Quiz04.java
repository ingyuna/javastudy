package ex02_2d_array;

import java.util.Scanner;

// 4. 성적 관리 프로그램 
// 각 점수는 입력 받아서 학생별 총점과 과목별 총점 
// 스폰지밥의 국어 점수 >>> 10
// 스폰지밥의 영어 점수 >>> 10
// 스폰지밥의 수학 점수 >>> 10
// ...
//         국어   영어   수학   학생합계 
// 스폰지밥    10	10  10   30
// 타요          10	10  10   30
// 브레드       10	10  10   30
// 과목합계     30	30  30   90  

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] names = { "스폰지밥", "타요", "브레드", "과목합계" };
		String[] subjects = { "국어", "영어", "수학", "학생합계"};
		int[][] scores = new int[names.length][subjects.length];
		
		
		for (int i = 0; i < names.length - 1; i++) {  // -1은 "과목합계"는 사람이름이 아니니까 브레드까지만 써주겠다는 얘기.
			for (int j = 0; j < subjects.length - 1; j++) {
				System.out.println(names[i] + "의 " + subjects[j] + "점수 입력 >>>");  // 실제로 입력받아서 저장하는곳은 scores이다.
				scores[i][j] = sc.nextInt();
				// 각각의 점수: scores[i][j]
				// 과목의 합계: scores[names.length - 1][j]                 //과목합계만 보면 [3][0], [3],[1], [3][2] 이렇게 볼 수 있는데. 학생수라고도 볼수있다. names.length(이름의 길이에 따라 다르니까)
										     		//여기서 과목합계는 빼야하니까 -1을 해준다. (4 - 1)	
													// 열은 j라고 볼 수 있다.
				// 학생의 합계:	 scores[i][subjects.length -1]						//과목합계만 보면 [0][3], [1],[3], [2][3] 이렇게 볼 수 있는데. 과목수라고도 볼수있다. 
				// 전체의 합계: scores[names.length -1][subjects.length -1]
				scores[names.length -1][j] += scores[i][j];
				scores[i][subjects.length - 1] += scores[i][j];
				scores[names.length -1][subjects.length -1] += scores[i][j];
			}
		}
		
		// 제목 출력
		System.out.print("\t ");      //line제거
		for (String subject : subjects) {
			System.out.print(subject + "\t");  //line제거
			                        // 여기까지가 한줄이다.
		}
		System.out.println();
		
		// 본문 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.print(names[i] + "\t");   //line제거
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
		
		
		
		
	}

}
