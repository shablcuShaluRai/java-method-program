class Check {

	void swap(int num1, int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;

	}
}

public class Passprimitive {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		Check ob = new Check();
		System.out.println(num1 + "\t" + num2);
		ob.swap(num1, num2);
		System.out.println(num1 + "\t" + num2);
		
		/*when we send primitive data types like int,float,char,String etc,to a method ,a copy of their values
		 * will be sent to the method .so any modification  to them inside the method will not affect their 
		 * original copy.this is also called the pass by value or call by value.
		 * 
		 * 
		 * 
		 */
		
		

	}

}
