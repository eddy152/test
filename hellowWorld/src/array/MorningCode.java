package array;

public class MorningCode {

	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
		int num = 1;

		for (int i = 0; i < intAry.length; i++) {
			for (int q = 0; q < intAry[i].length; q++) {
				intAry[i][q] += num;
				num++;

				System.out.println("intAry[" + i + "][" + q + "] : " + intAry[i][q]);
			}

		}
		String[] strAry = { "Hello", "world" };
		for (String str : strAry) {
			System.out.println(str);
		}

	}

}
