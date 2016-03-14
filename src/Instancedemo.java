class Test
{
//Instance variable
	int x=10;

	void display(){
		System.out.println(x);
	}
}


public class Instancedemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Test ob1,ob2;
	ob1=new Test();
	ob2=new Test();
	++ob1.x;
	System.out.print(" x of ob1:");
	ob1.display();
     //ob2.x++;
	System.out.print("x of ob2:");
	ob2.display();
	
	}

}
