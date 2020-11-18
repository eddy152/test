package variable;

public class MorningCode {
	public static void main(String[] args) {
		int[] intNumbers = { 23, 56, 34, 65, 28, 21 };
		int sum = 0;
		double avg = 0;
		
		for(int i = 1; i <= intNumbers.length; i++) {
			if (i % 2 != 0) {
				System.out.println(intNumbers[i-1]);
				
				sum += intNumbers[i-1];
				System.out.println("홀수번 값들의 합 : " + sum);
				avg++;
			}
		}
		System.out.println("평균값 : " + (sum / avg));
	}
}
