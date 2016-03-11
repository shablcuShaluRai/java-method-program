class Person {
	int age;
	String name;

	void talk() {
		System.out.println("write the table");
		for (int i = 1; i <= 10; i++) {
			int x = 2;
			x = x * i;
			System.out.println(x);

		}
	}

}

public class Demo {

	public static void main(String[] args) {

		Person person1 = new Person();
		// person1.talk();
		person1.name = "Shalu";
		person1.age = 20;

		System.out.println(person1.name);
		// System.out.println(person1.age);
		person1.talk();

	}

}
