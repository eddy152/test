package variable2;
import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.S_name = "가나다";
//		s1.S_num = 21628453;
//		s1.S_eng = 93;
//		s1.S_math = 90;
//		
//		Student s2 = new Student();
//		s2.S_name = "라마바";
//		s2.S_num = 21628555;
//		s2.S_eng = 83;
//		s2.S_math = 80;
//		
//		Student s3 = new Student();
//		s3.S_name = "사아자";
//		s3.S_num = 21627123;
//		s3.S_eng = 75;
//		s3.S_math = 95;
//		
//		Student[] S_date = { s1, s2, s3 };
//		for (Student sd : S_date) {
//			System.out.println(sd.S_name);
//			System.out.println(sd.S_num);
//			System.out.println(sd.S_eng);
//			System.out.println(sd.S_math);
//			System.out.println();
//		}
		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		s1.S_name = sc.next();
		System.out.print("학번 : ");
		s1.S_num = sc.nextInt();
		System.out.print("영어점수 : ");
		s1.S_eng = sc.nextInt();
		System.out.print("수학점수 : ");
		s1.S_math = sc.nextInt();
		System.out.println();
				
		s1.Sinfo();
		s1.totalScore();
		
	}
	
}
