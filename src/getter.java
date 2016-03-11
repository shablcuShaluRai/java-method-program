class Personn {
	String name;
	int age;

	void speak() {
		System.out.println("my name is:" + name);
	}

	int getRetirmentYear() {
		int retyears = 70 - age;
		return retyears;
	}

	String getName() {
		return name;
	}

	int getAge() {
      System.out.println("age is given:"+age);
		return age;
	}
}

public class getter {

	public static void main(String[] args) {
		Personn person1 = new Personn();
		person1.name = "shalu";
		person1.age = 20;

		person1.speak();

		int years = person1.getRetirmentYear();
		System.out.println("my retirment time is :" + years);

		String naame = person1.getName();
		System.out.println("my name is:" + naame);

		int age1 = person1.getAge();
		//System.out.println("my age is:" + age1);
	}

}
