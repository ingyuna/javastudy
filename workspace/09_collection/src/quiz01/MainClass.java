package quiz01;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// 문제.
// 임의의 Member를 3명 저장하고,
// 사용자로부터 회원번호를 입력 받아서 해당 회원의 삭제를 진행하시오.

public class MainClass {

	public static void main(String[] args) {
		
		Date date = new Date(System.currentTimeMillis());
		// java.sql.Date date = new java.sql.Date(System.currentTimeMillis());      // import 안할꺼면 패키지부터 이렇게 풀네임 적어도 된다. 근데 너무 길이지니까 노노. 
		
		Member m1 = new Member(1000, "user1", new Date(System.currentTimeMillis()));
		Member m2 = new Member(1001, "user2", new Date(System.currentTimeMillis()));
		Member m3 = new Member(1002, "user3", new Date(System.currentTimeMillis()));
		
		List<Member> members = new ArrayList<Member>();
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 회원번호를 입력하세요 >>> ");
		int mNo = sc.nextInt();
		
		int removeIdx = -1;   // 삭제할 회원의 인덱스 (삭제할 회원이 없다. 아직 for문 돌리기 전이기 때문에)
		int length = members.size();     // 가독성을 위해서 2줄로 분리해줄거다.
		for (int i = 0; i < length; i++) {
			// members.get(0) == m1
			if (members.get(i).getMNo() == mNo) {
				removeIdx = i; 
				break;
			}
		}
		if (removeIdx == -1) {
			System.out.println(mNo + " 회원번호를 가진 회원이 없습니다.");
		} else {
			members.remove(removeIdx);
			System.out.println(mNo + " 회원번호를 가진 회원 정보를 삭제했습니다.");
		}
		
		// Member 클래스는 toString() 메소드가 오버라이드 되어 있으므로
		// System.out.println(m1); 처럼 출력이 가능합니다. 
		System.out.println("한 번에 확인: " + members);
		System.out.println("순회");
		for (Member member : members) {
			System.out.println(member);
		}
		
		sc.close();
	}

}
