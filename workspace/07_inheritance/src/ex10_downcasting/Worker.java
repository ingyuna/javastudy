package ex10_downcasting;

public class Worker extends Person {  // 지금 worker는 먹고, 자고, 일하고만 가능

	// method
	public void work() {
		System.out.println("일한다.");
	}
	
	/*
	 ﻿Person p = new Student();
     Person p = new Worker();
				-> 이게 upcasting

	 */
	/*
	 1. Person p
	  	p.eat()
	  	p.sleep()
	  	p.study(); // 이건 에러난다.
	  	-> 해결책 : Person에도 study를 넣는다.
	  	그럼 student는 override를 해야한다.
	  	근데 이 상황에서는 맞지 않는다. (모든 사람이 study를 하지 않기때문. 이 상황에서 공부는 student만 함)
	 */
}
