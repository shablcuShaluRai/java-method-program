class Sample1 {
	 int x;

	Sample1() {
		this(55);
		this.access();

	}

	Sample1(int x) {
		this.x = x;
	}

	void access() {
		System.out.println("x=" + x);
	}

}

public class Thisdemo {

	
	public static void main(String[] args) {
		Sample1 s=new Sample1();
	}

}
