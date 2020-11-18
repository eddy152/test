package variable;

public class MethodExample {
	public static void main(String[] args) {
		//두수를 더해서 2로 나누고 50을 더하고 다시 10을 나눔.
		int num1, num2, result;
		num1 = 34;
		num2 = 55;
		
		result = sumMethod(num1, num2);
		System.out.println(result);
		
		int val1 = 20, val2 = 50;
		result = sumMethod(val1, val2);
		System.out.println(result);
		
		int val3 = 22, val4 = 55;
		result = sumMethod(val3, val4);
		System.out.println(result);
		
		int val5 = 24, val6 = 60;
		result = sumMethod(val5, val6);
		System.out.println(result);
		
		int val7 = 26, val8 = 65;
		result = sumMethod(val8, val8);
		System.out.println(result);
	}
	
	public static int sumMethod(int numb1, int numb2) {
		int result = numb1 + numb2;
		result /= 2;
		result += 50;
		result /= 10;
		return result;
	}
	
}
