class Test12 {
	static int x = 10;

	static void display() {
		System.out.println(x);

	}

}

public class Statvar {

	
	public static void main(String[] args) {
		
	Test12 obj1,obj2;
	obj1=new Test12();
	obj2=new Test12();
	++obj1.x;
	System.out.println("x in obj1:");
	obj1.display();
	System.out.println("x in obj2:");
	obj2.x++;
	obj2.display();
	
	}

}
