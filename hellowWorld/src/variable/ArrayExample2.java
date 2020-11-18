package variable;

public class ArrayExample2 {

	public static void main(String[] args) {
		double[] dAry;
		dAry = new double[] { 23.2, 55.3, 52.8, 62.9 };

		System.out.println(doubleSum(dAry));
		System.out.println(doubleAvg(dAry));
	}

	public static double doubleSum(double[] dob) {
		double sum = 0;

		for (double db : dob) {
			sum += db;
		}
		return sum;
	}

	public static double doubleAvg(double[] db) {
		return doubleSum(db) / db.length;
	}
}
