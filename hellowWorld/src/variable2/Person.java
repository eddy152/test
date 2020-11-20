package variable2;

public class Person {
	// 필드
	String name;
	int age;
	double height;
	double weight;
	
	//생성자 : 필드의 초기값 지정. 특징 : 반환타입이 없다.
	public Person() {
		this.name = "초기이름";
		this.age = 0;
		this.height = 0.0;
		this.weight = 0.0;
		
	}
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 메소드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public void setAge(int age) {
		if (age > 0) {
		this.age = age;
		} else { System.out.println("잘못된 값");
		}
	}
}
