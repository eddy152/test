package variable;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		intAry[0] = 15;
		intAry[4] = 33;
		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}

		double[] doubleAry;
		doubleAry = new double[] { 2.3, 2, 4.5, 2.2, 1.4 };
		System.out.println(doubleAry[0]);
		double sum = 0;
		for (int i = 0; i < doubleAry.length; i++) {
			sum += doubleAry[i];
		}
		System.out.println("sum : " + sum);
		
		// enhanced for
		for(double db1 : doubleAry) { //doubleAry의 길이만큼 순차적으로 db1에 대입 배열에서 사용. 
			sum += db1;
			System.out.println(db1);
		}
		System.out.println("sum : " + sum);
	}
}

