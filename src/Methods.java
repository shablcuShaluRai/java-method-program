class Sample3 {
	int x, y;
//static type method define that accept the data and returns the result
	static int sum(int x,int y) {
		int c = x + y;
		
		System.out.println("sum of these number= "+c);
		return c;

	}

}

public class Methods {

	
	public static void main(String[] args) {
		
		
		//call the static method using classname.methodname().
		//int  z=Sample3.sum(20, 30);
		//System.out.println("sum =" +z);
		Sample3.sum(20, 30);
	}

}
