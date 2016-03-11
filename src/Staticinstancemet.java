
<<<<<<< HEAD


=======
>>>>>>> added the static program
class Test1
{
//Instance variable
	 static int x=10;
	
	//display the variable
	 static void display(){
		System.out.println(x);
	}
}

public class Staticinstancemet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 ob1,ob2;
		ob1=new Test1();
		ob2=new Test1();
		++ob1.x;
		System.out.print(" x of ob1:");
		ob1.display();
	     //ob2.x++;
		System.out.print("x of ob2:");
		ob2.display();
		/* A class  variable will have only one copy  in memory and that is shared by all the object 
		 * ,any modification to it will also affect other object*/
		
	}

}
