package quiz01;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Member {

	// field
	private int mNo;  // 회원번호
	private String mId;  // 회원아이디
	private Date mDate;  // 회원가입일
	
	// lombok을 활용한 getter, setter, constructor 자동 생성
	
	// Object 클래스의 toString() 오버라이드   => 만들지말고 java한테 맡겨라. 소스 메뉴 - Generate to String() 선택
	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mDate=" + mDate + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
