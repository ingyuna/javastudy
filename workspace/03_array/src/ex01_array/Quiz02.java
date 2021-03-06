package ex01_array;

import java.util.Scanner;

public class Quiz02 {

	// 2. String[] friendList = {"타요", "짱구", "스폰지밥"};
	//   새로 사귄 친구의 수를 입력 받아서, 
	//   그 만큼 friendList 배열의 길이를 늘이기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] friendList = {"타요", "짱구", "스폰지밥"}; // 코드를 짜서 새로운 배열을 만들고 그 배열로 바꿔치는 작업을 하면 된다. 곧바로 늘려주는게 안된다(바꿀수없음)
														// 이 문제를 해결하기 위해 컬렉션이라고 하는걸 사용한다.
		
		System.out.println("새로 사귄 친구가 몇 명? >>> ");
		int newFriend = sc.nextInt();
		
		// 새로운 배열을 만듭니다.
		String[] temp = new String[friendList.length + newFriend];    //원래 3명이니까 일단 3 + 'newfriend' 줄이는 경우는 거의 없고 이렇게 늘리는 경우가 많다.
		
		// 새로운 배열로 기존 친구 명단을 넘깁니다.
				
		for (int i = 0; i < friendList.length; i++) {
			temp[i] = friendList[i];
		}
		
		// 새 친구들을 입력 받습니다.
		for (int i = friendList.length; i < temp.length; i++ ) {//i를 0부터 하면 '타요'부터 입력되니까 '스폰지밥 길이 뒤에부터 가게 해준다
			System.out.println("새 친구 이름 >>> ");
			temp[i] = sc.next();
		}

		// 새로운 배열로 갈아탑니다.
		friendList = temp;
		
		// 확인해 봅시다.
		for ( String friend : friendList ) {
			System.out.println(friend);
		}
		
			
		sc.close();
	}

}
