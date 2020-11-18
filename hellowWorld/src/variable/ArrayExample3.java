package variable;

public class ArrayExample3 {

	public static void main(String[] args) {

//		int num1 = 30, num2 = 20, num3 = 20;
//		int temp = 0;
//
//		if (num1 > num2) {
//			if (num1 > num3) {
//				temp = num1;
//			} else {
//				temp = num3;
//			}
//		} else {
//			if (num2 > num3) {
//				temp = num2;
//			} else {
//				temp = num3;
//			}
//		}
//		System.out.println(temp);
		
		int num[] = {100,50,30};
		int max = 0;
		
		for (int n : num) {
			if (max < n) {
				max = n;
			}
			}
//		int max = num[0];
//		
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] >= max) {
//				max = num[i];
//			}
//		}
		System.out.println(max);
	}
}
