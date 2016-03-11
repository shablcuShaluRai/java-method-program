class Sample {
	int a, b;

	/*Sample(int x, int y) {

		a = x;
		b = y;

	}*/

	int calculate(int a,int b){
		int c = a + b;
//		System.out.println(c);
		return c;
	}

}

public class Pr2met {

	
	public static void main(String[] args) {
	/*Sample s =new Sample(10,20);
	int d=s.calculate();
	System.out.println("sum="+d);

	*/	
	Sample s = new Sample();
		int d = s.calculate(10,20);
		System.out.println("sum of the digit="+d);

	}

}
