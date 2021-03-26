package quiz01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// 사용자로부터 국, 영, 수 점수를 입력 받은 뒤,
// int[] 배열에 저장한다.
// score.dat 파일에 이름, 입력 받은 점수, 평균을 저장하시오.

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		                               // new Scanner(new FileInputStream("xxx"));  -> 이것도 가능하다. 
		
		String[] subjects = {"국어", "영어", "수학", "과학"}; 
		int[] scores = new int[subjects.length];
		String name = "james";
		int total = 0;
		double ave = 0;
		
		for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i] + " >>> ");
			scores[i] = sc.nextInt(); 		
			total += scores[i];           // 따로 빼지말고 입력받아서 합계 누적시키기
		}
		ave = total / subjects.length;
		
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat"))) {
			dos.writeInt(subjects.length);
			dos.writeUTF(name);
			for (int score : scores) {
				dos.writeInt(score);
			}
			dos.writeDouble(ave);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();

	}

}
