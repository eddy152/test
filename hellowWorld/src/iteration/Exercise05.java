package iteration;

public class Exercise05 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int x = 4 * i;
			for (int z = 1; z <= 10; z++) {
				int y = 5 * z;
				if (x + y == 60) {
					System.out.println("(" + i + "," + z + ")");
				}

			}
		}
	}

}
