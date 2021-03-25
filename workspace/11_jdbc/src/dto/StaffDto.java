package dto;

import java.sql.Date;

// DB Table에 저장된 행(Row)을 저장하는 클래스
// VO : Value Object
// DTO : Data Transfer Object

// 테이블 칼럼    클래스 필드
// BOARD_NO       board_no  또는 boardNo
// BNO            bNo 

// 디폴트 생성자 필수 : 생성자를 안 만들거나, 디폴트 생성자와 필드를 이용한 생성자를 모두 만듭니다.      -> 지금 안만들었으니까 디폴트로 되어있음.
// getter/setter 필수
// * field를 이용한 생성자는 각자의 선택에 맞김. 상황에 따라 써도 되고 안써도 되는데, 안만드는게 일반적이다. 
// -> 생성자 : 생성방법이 오직 이거 하나뿐이다 라는 말이기때문에 field를 이용한 생성자를 추가하게 되면 디폴트 생성자/ getter/setter 이거 못함.
// 만약에 하고 싶으면, public StaffDto() {} 이렇게 디폴트를 생성해줘야함. 아래처럼.


public class StaffDto {
	
	// field
	private int no;
	private String name;
	private String department;
	private Date hireDate;

	// constructor
	public StaffDto() {}
	public StaffDto(int no, String name, String department, Date hireDate) {
		super();
		this.no = no;
		this.name = name;
		this.department = department;
		this.hireDate = hireDate;
	}



	// getter/setter
	// * getter/setter가 필수인 이유 -> 이걸 통해서 데이터를 저장 시킬 수 있고, 저장된 데이터를 꺼내볼 수 있어서. 저장하는게 setter / 꺼내보는게 getter
	// 자바 이외의 모든것들도 getter/setter가 기본적인 입출력 도구이기때문에 반드시 필요하다(myBatis라던지, spring 같은..) 
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "StaffDto [no=" + no + ", name=" + name + ", department=" + department + ", hireDate=" + hireDate + "]";
	}
}
