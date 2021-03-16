package ex02_String;

import java.util.Scanner;

// 1. 시간을 입력 받아서 출력하기
// 시간 >>> 9
// 분 >>> 5
// 초 >>> 30
// 9:05:30         --> 5 -> 05로 바꿔보라는 작업 (=문제의 목표)

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		System.out.println(" 시간 >>> "); hour = sc.nextInt();
		System.out.println(" 분 >>> "); minute = sc.nextInt();
		System.out.println(" 초 >>> "); second = sc.nextInt();
		
		String strHour = hour + "";  // String.valueof(hour);    -> hour를 String으로 바꾸는 2가지 방법
		String strMinute = minute + "";
		String strSecond = second + "";
		
		if (strMinute.length() == 1) { // if (minute < 10) {
			strMinute = "0" + strMinute;
			}
		if (strSecond.length() == 1) { // if (second < 10) {
			strSecond = "0" + strSecond;
			
		}
		
		String time = strHour + ":" + strMinute + ":" + strSecond;
		System.out.println(time);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
