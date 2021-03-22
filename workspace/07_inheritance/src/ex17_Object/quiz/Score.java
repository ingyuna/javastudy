package ex17_Object.quiz;

public class Score {

	// field
	private int kor, eng, mat;
	
	// constructor         -> 2가지의 생성자를 만들어 준다.
	public Score() {}       
	public Score(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// method
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		return "[국어: " + kor + ", 영어: " + eng + ", 수학: " + mat + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Score) {
			Score s = (Score)obj;
			return (kor == s.kor && eng == s.eng && mat == s.mat);
		}
		return false;
	}
	
}
