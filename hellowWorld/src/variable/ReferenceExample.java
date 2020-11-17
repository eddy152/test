package variable;

public class ReferenceExample {
	public static void main(String[] args) {
		String str1 = "Hello";//주소값..
		String str2 = "Hello";//주소값..
		String str3 = new String("Hello");//주소값..
		if(str2.equals(str3)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
