package hellowWorld;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "Hong kildong";
		name = "가나다";
		System.out.println("My name is " + name);
		int age = 20;
		System.out.println("My age is " + age);
		int height = 170;
		System.out.println(name + "의 키는 " + height + " 입니다.");
		String name1 = "라마바";
		int age1 = 22;
		double height1 = 180.23;
		double sumheight = height + height1;
		System.out.println(name1 + "의 키는 " + height1 + " 입니다. 나이는 " + age1 + " 입니다.");
		System.out.println("두 사람의 나이의 합은 " + (age + age1) + " 입니다.");
		System.out.println("두 사람의 키의 합은 " + sumheight + " 입니다.");
	}
}