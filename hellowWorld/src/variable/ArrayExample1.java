package variable;

public class ArrayExample1 {
	public static void main(String[] args) {
		int[] numbers = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
		int sum = 0;
		
		for(int i = 1; i <= 10; i ++) {
			if(i % 2 != 0) {
				sum += numbers[i-1];
				System.out.print(numbers[i-1] + "  ");
				System.out.println(sum);
			}
		}

	}
}
