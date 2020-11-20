package variable2;

public class VariableExample {
	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		double dbl = 3.4;

		String name = "Hong";
		int age = 20;
		double height = 178.8;

		String name1 = "Hwang";
		int age1 = 25;
		double height1 = 188.8;

		Person p1 = new Person();
		System.out.println("p1의 이름 : " + p1.getName());
		System.out.println("p1의 나이 : " + p1.getAge());
		System.out.println("p1의 키 : " + p1.getHeight());
		
		p1.name = "Hong";
		p1.setName("홍");
		p1.age = 20;
		p1.setAge(15);
		p1.height = 178.8;
		p1.showInfo();
		System.out.println("p1의 이름 : " + p1.getName());
		System.out.println("p1의 나이 : " + p1.getAge());
		System.out.println("p1의 키 : " + p1.getHeight());

		Person p2 = new Person();
		p2.name = "Hwang";
		p2.age = 25;
		p2.height = 188.8;
		p2.showInfo();

		Person p3 = new Person();
		p3.name = "Gung";
		p3.age = 10;
		p3.height = 158.8;
		p3.weight = 56.5;
		p3.showInfo();
		
		Person p4 = new Person("가자미", 20);
		p4.showInfo();
		

//		Person[] persons = { p1, p2, p3 };
//		for (Person per : persons) {
//			System.out.println(per.name);
//			System.out.println(per.age);
//			System.out.println(per.height);
//			System.out.println(per.weight);
//			System.out.println();
//		}
	}
}
