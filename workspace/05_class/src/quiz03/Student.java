package quiz03;

public class Student {

	
	// field
	
	String name;
	int kor, eng, mat;
	
	// method
	
	void set(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}
	
	
	double getAverage() {
		return (kor + eng + mat) / 3.0;    // -> 3으로 나누면 안됨. 실수가 섞여있으니까. 
	}
		
	String getPass() {
		return getAverage() >= 60 ?  "합격" : "불합격";   // 평균을 구하는건 위에 getAverage()가 있으니까 일일이 다시 써줄필요없이 그대로 getAberage()라고 써준다. 
	}
	
	
}
