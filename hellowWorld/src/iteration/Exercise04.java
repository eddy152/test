package iteration;

public class Exercise04 {
	public static void main(String[] args) {

		boolean run = true;

		while (run) {

			int num = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			int sum = num + num2;

			if (sum == 5) {
				System.out.println("(" + num + "," + num2 + ")");
				System.out.println(num + " + " + num2 + " = " + sum);
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("(" + num + "," + num2 + ")");
			}
		}

	}

}
