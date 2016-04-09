class Employee {
	int id1,id2;

	Employee(int id1,int id2) {
		this.id1 = id1;
		this.id2 = id2;
	}

}

class Check1 {
	void swap(Employee obj1) {

		int temp;
		temp = obj1.id1;
		obj1.id1 = obj1.id2;
		obj1.id2 = temp;

	}
}

public class Passobj {

	
	public static void main(String[] args) {
		
		Employee obj2=new Employee(10,20);
	
		Check1 obj=new Check1();
		System.out.println(obj2.id1+"\t"+obj2.id2);
		obj.swap(obj2);
		System.out.println(obj2.id1+"\t"+obj2.id2);
		
		
		
	}

}
