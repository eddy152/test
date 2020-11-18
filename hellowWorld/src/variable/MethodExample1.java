package variable;

public class MethodExample1 {
	public static void main(String[] args) {
		showInfo("이왕사");
		int result = showDouble(45);
		System.out.println("반환값 : " + result);
		System.out.println(showDouble(531.2));
		System.out.println("multi 반환값 : " + multi(2, 2, 2));
		System.out.println("double 반환값 : " + divide(2, 8));
	}

	public static void showInfo(String name) {
		System.out.println("안녕하세요. " + name + "입니다.");
	}

	public static int showDouble(int num) {
		return num * 2;
	}

	public static double showDouble(double num) {
		return num * 2;
	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	// 정수형 변수 3개를 받아서 세수의 곱을 반환 메소드(multi) 만들기
	public static int multi(int mul1, int mul2, int mul3) {
		return mul1 * mul2 * mul3;
	}

	// double 2개를 받아서 첫번째 매개변수/ 두번째 매개변수 나누는 메소드(divide)만들기
	public static double divide(double di1, double di2) {
		if (di1 > di2) {
			return di1 / di2;
		} else {
			return di2 / di1;
		}
	}
}
