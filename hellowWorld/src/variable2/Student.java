package variable2;

public class Student {
	String S_name;
	int S_num;
	int S_eng;
	int S_math;
	
	public Student() {
		this.S_name = "초기이름";
		this.S_num = 0;
		this.S_eng = 0;
		this.S_math = 0;
	}
	public Student(String S_name, int S_num, int S_eng, int S_math) {
		this.S_name = S_name;
		this.S_num = S_num;
		this.S_eng = S_eng;
		this.S_math = S_math;
	}
	public void Sinfo() {
		System.out.println("학생이름 : " + S_name);
		System.out.println("학번 : " + S_num);
		System.out.println("영어점수 : " + S_eng);
		System.out.println("수학점수 : " + S_math);
	}
	public void totalScore() {
		int result = S_eng + S_math;
		System.out.println("총 점수 : " + result);
	}

}
