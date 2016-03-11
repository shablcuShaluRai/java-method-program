class Addition {
	double num1, num2;

	Addition(int a,double b) {
		num1 = a;
		num2 = b;

	}
	
	
	void sum(){
		double num=num1+num2;
		System.out.println("sum of these number "+num);
	}

}

public class Method2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Addition add=new Addition(10  ,20.5);
		add.sum();
		
		

	}

}
