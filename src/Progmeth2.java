class Sample2
{
	static double sum(double x,double y){
		
		double z=x+y;
       //System.out.println("sum of the digit="+z);
		return z;
	}
}







public class Progmeth2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//  call static method  by using Classname.methodname()
		double x=Sample2.sum(10,20.5);
		System.out.println("sum="+x);

	}

}
