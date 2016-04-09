
class Student10{
	String name;
	int age;
	
	 Student10(int age,String name) {
      this.age=age;
     this.name=name;
	}
	void Display(){
		System.out.println("HaHaHa I am " +name);
		System.out.println("my age is"+age);
	}
	
	
}



public class Simple1 {

	
	public static void main(String[] args) {
		Student10 s=new Student10(1000,"Ravan");
		Student10 p=new Student10(1200,"Marich");
		s.Display();
		p.Display();
		
		
	}

}
