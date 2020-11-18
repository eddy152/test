package variable;

public class HW {

	public static void main(String[] args) {
		// intAry2의 배열의 각 합, 평균 구하기
		int[][] intAry2 = { { 11, 12, 13 }, { 21 }, { 31, 21 } };
		int sum = 0;
		
		for (int i = 0; i < intAry2.length; i++) {
			for (int q = 0; q < intAry2[i].length; q++) {
				sum += intAry2[i][q];
			}
			System.out.println("intAry[" + i + "] 합 : " + sum);
			System.out.println("intAry["+ i + "]평균 :" + sum/intAry2[i].length);
		}
	}
}
