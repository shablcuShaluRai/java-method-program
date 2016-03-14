class Person23 {
	String name;
	int age;

	public void setname(String name) {
		this.name = name;

	}

	public void setage(int age) {
		this.age = age;
	}

	public String getname() {
		System.out.println("my name is "+name);
		return name;

	}

	public int getage() {
		return age;
	}

}

public class Methods1 {

	
	public static void main(String[] args) {
		Person23 p=new Person23();
		p.setname("shalu");
		p.setage(20);
	p.getname();
		//System.out.println("my name is "+p.getname());
		System.out.println("my age is "+p.getage());

	}

}
