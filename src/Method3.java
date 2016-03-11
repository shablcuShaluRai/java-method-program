class Sample12{
	
	//static type variable define
static	int x;
// another method to define the static type variable.
// static int x=50;
static void call(){
	x=50;
	System.out.println("x= "+x);
}


}




public class Method3 {

	
	public static void main(String[] args) {
		
		Sample12.call();

	}

}
