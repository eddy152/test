package variable;

public class ArrayExample {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5 };
		int[] numbers = { 10, 20, 30, 40, 50 };
		numbers[2] = 200;
		int sum = 0;
		String name[] = { "Hello ", "World ", "Nice ", "To ", "Meet ", "You" };
		String nam = "";
		name[2] = "Good ";

		for (int i = 0; i < 6; i++) {
			System.out.println(name[i]);
			nam += name[i];
			System.out.println(nam);
		}

	}
}
